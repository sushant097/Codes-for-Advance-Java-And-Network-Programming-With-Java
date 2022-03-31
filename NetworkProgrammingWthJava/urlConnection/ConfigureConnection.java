package urlConnection;

import java.io.*;
import java.net.*;

public class ConfigureConnection {

	public static void main(String[] args) {
		try {
			URL u = new URL("https://www.oreilly.com/");
			URLConnection uc = u.openConnection();
			System.out.println(uc.getURL());

			// The value true indicates that user interaction is allowed;
			// false indicates that there is no user interaction.
			uc.setAllowUserInteraction(true);
			// The protected boolean field doInput is true if the URLConnection
			// can be used
			// for reading, false if it cannot be.
			if (!uc.getDoInput()) {
				uc.setDoInput(true);
			}
			// Programs can use a URLConnection to send output back to the
			// server
			// The protected boolean field doOutput
			// is true if the URLConnection can be used for writing, false if it
			// cannot be;
			// it is false by default

			if (!uc.getDoOutput()) {
				uc.setDoOutput(true);
			}
			
			// The useCaches variable determines whether a cache will be used if it’s available
			uc.setUseCaches(false);
			
			// You can also set connection and read timeout as:
			uc.setConnectTimeout(30000);
			uc.setReadTimeout(45000);
			
			InputStream in = uc.getInputStream();

		} catch (IOException ex) {
			System.err.println(ex);
		}

	}

}
