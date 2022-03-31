package secureSocket;

import java.io.*;
import javax.net.ssl.*;

public class HttpsClient { 
	public static void main(String[] args) { 

		int port = 443; // default https port
		String host = "www.usps.com";
		// creating secure socket
		SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
		SSLSocket socket = null;
		try {
			// connect secure soket to host, port
			socket = (SSLSocket) factory.createSocket(host, port);
			// enable all the suites
			String[] supported = socket.getSupportedCipherSuites();
			socket.setEnabledCipherSuites(supported);
			// Get outputStream to write to  the server
			Writer out = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
			// https requires the full URL in the GET line
			out.write("GET http://" + host + "/ HTTP/1.1\r\n");
			out.write("Host: " + host + "\r\n");
			out.write("\r\n");
			out.flush();

			// read response
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// read the header
			String s;
			while (!(s = in.readLine()).equals("")) {
				System.out.println(s);
			}
			System.out.println();
			// read the length
			String contentLength = in.readLine();
			int length = Integer.MAX_VALUE;
			try {
				length = Integer.parseInt(contentLength.trim(), 16);
			} catch (NumberFormatException ex) {
				// This server doesn't send the content-length
				// in the first line of the response body
			}

			System.out.println(contentLength);
			int c;
			int i = 0;
			// read each character by character
			while ((c = in.read()) != -1 && i++ < length) {
				System.out.write(c);
			}
			System.out.println();
		} catch (IOException ex) {
			System.err.println(ex);
		} finally {
			try {
				if (socket != null)
					socket.close();
			} catch (IOException e) {
			}
		}
	}

}
