package urlConnection;

import java.io.*;
import java.net.*;
import java.util.*;

/*
 * Code that prints the default value of ifModifiedSince, sets its value to 24 hours
	ago, and prints the new value. It then downloads and displays the document—but only
	if it’s been modified in the last 24 hours.prints the default value of ifModifiedSince, 
	sets its value to 24 hours ago, and prints the new value. 
	It then downloads and displays the document—but only if it’s been modified in the last 24 hours.
 */

public class IfModifiedSinceExample {
	static String url = "http://www.elharo.com";

	public static void main(String[] args) {
		// Initialize a Date object with the current date and time
		Date today = new Date();
		// setting time in milliseconds
		long millisecondsPerDay = 24 * 60 * 60 * 1000;
		try {
			URL u = new URL(url);
			URLConnection uc = u.openConnection();
			System.out.println("Original if modified since: " + new Date(uc.getIfModifiedSince()));
			uc.setIfModifiedSince((new Date(today.getTime() - millisecondsPerDay)).getTime());
			System.out.println("Will retrieve file if it's modified since " + new Date(uc.getIfModifiedSince()));
			try (InputStream in = new BufferedInputStream(uc.getInputStream())) {

				Reader r = new InputStreamReader(in);
				int c;
				while ((c = r.read()) != -1) {
					System.out.print((char) c);
				}
				System.out.println();
			}
		} catch (IOException ex) {
			System.err.println(ex);
		}

	}
}
