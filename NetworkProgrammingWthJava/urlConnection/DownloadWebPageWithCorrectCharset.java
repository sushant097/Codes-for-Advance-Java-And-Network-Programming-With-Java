package urlConnection;

import java.io.*;
import java.net.*;

public class DownloadWebPageWithCorrectCharset {
	public static void main(String[] args) {

		String urls[] = { "https://www.oreilly.com/", "https://www.google.com", "https://www.facebook.com" };
		for (int i = 0; i < urls.length; i++) {
			System.out.println("FOR "+urls[i]+"\n===========================\n\n\n");
			
			try {
				// set default encoding
				String encoding = "ISO-8859-1";
				URL u = new URL(urls[i]);
				URLConnection uc = u.openConnection();
				String contentType = uc.getContentType();
				int encodingStart = contentType.indexOf("charset=");
				if (encodingStart != -1) {
					encoding = contentType.substring(encodingStart + 8);
				}
				InputStream in = new BufferedInputStream(uc.getInputStream());
				Reader r = new InputStreamReader(in, encoding);
				int c;
				while ((c = r.read()) != -1) {
					System.out.print((char) c);
				}
				r.close();
			} catch (MalformedURLException ex) {
				System.err.println(urls[i] + " is not a parseable URL");
			} catch (UnsupportedEncodingException ex) {
				System.err.println("Server sent an encoding Java does not support: " + ex.getMessage());
			} catch (IOException ex) {
				System.err.println(ex);
			}
		}
	}

}
