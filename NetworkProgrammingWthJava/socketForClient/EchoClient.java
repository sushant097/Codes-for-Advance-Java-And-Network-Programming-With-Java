package socketForClient;

import java.io.*;
import java.net.*;

public class EchoClient {
	static Socket echoSocket = null;
	static PrintWriter out = null;
	static BufferedReader in = null;
	static String host = "dict.org";
	static final int port  = 2628;

	public static void main(String[] args) throws IOException {
		try {
			echoSocket = new Socket(host, port);
			out = new PrintWriter(echoSocket.getOutputStream(), true);	
			in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
		} catch (UnknownHostException e) {
			System.err.println("Don't know about host: " + host);
			System.exit(1);
		} catch (IOException e) {
			System.err.println("Couldn't get I/O for " + "the connection to:" + host + " .");
			System.exit(1);
		}
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
		String userInput;

		while ((userInput = stdIn.readLine()) != null) {
			// write data to the server
			out.println("DEFINE fd-eng-lat  "+userInput+" \r\n");
//			out.println("SHOW DB");
			// read the data
			for (String line = in.readLine();
					!line.equals(".");
					line = in.readLine()){
				System.out.println(line);
			}
//			System.out.println("echo: " + in.readLine());
		}
		out.print("quit\r\n");
		out.close();
		in.close();
		stdIn.close();
		echoSocket.close();

	}

	
}
