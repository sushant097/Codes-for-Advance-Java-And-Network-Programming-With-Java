package urlConnection;

import java.io.*;
import java.net.*;
import java.util.*;

public class ReturnHeader {
	public static void main(String[] args) {
		String urls[] = { "https://www.oreilly.com/", "https://www.oreilly.com/favicon.ico", "https://www.google.com", "https://www.facebook.com"};                            // "https://www.geeksforgeeks.org/", "https://www.amazon.in/" };

		for (int i = 0; i < urls.length; i++) {
			System.out.println("FOR "+urls[i]+"\n===========================\n\n\n");

			try {
				URL u = new URL(urls[i]);
				URLConnection uc = u.openConnection();
				System.out.println("Content-type: " + uc.getContentType());
				if (uc.getContentEncoding() != null) {
					System.out.println("Content-encoding: " + uc.getContentEncoding());
				}
				if (uc.getDate() != 0) {
					System.out.println("Date: " + new Date(uc.getDate()));
				}
				if (uc.getLastModified() != 0) {
					System.out.println("Last modified: " + new Date(uc.getLastModified()));
				}
				if (uc.getExpiration() != 0) {
					System.out.println("Expiration date: " + new Date(uc.getExpiration()));
				}
				
				if (uc.getContentLength() != -1) {
					System.out.println("Content-length: " + uc.getContentLength());
				}
			} catch (MalformedURLException ex) {
				System.err.println(urls[i] + " is not a URL I understand");
			} catch (IOException ex) {
				System.err.println(ex);
			}
			System.out.println();
		}
	}

}
