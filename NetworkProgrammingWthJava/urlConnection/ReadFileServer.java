package urlConnection;

import java.io.*;
import java.net.*;

public class ReadFileServer {

	public static void main(String[] args) {
		String url = "https://www.oreilly.com/";
		
		// read index.html file of the server
		try {
			// Open the URLConnection for reading
			URL u = new URL(url);
			URLConnection uc = u.openConnection();
			try (InputStream raw = uc.getInputStream()) { // autoclose
				InputStream buffer = new BufferedInputStream(raw);
				// chain the InputStream to a Reader
				Reader reader = new InputStreamReader(buffer);
				int c;
				while ((c = reader.read()) != -1) {
					System.out.print((char) c);
				}
			}
		} catch (MalformedURLException ex) {
			System.err.println(url + " is not a parseable URL");
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}

}
