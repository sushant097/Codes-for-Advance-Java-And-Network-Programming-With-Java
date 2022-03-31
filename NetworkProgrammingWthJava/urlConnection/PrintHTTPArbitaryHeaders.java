package urlConnection;

import java.io.*;
import java.net.*;


public class PrintHTTPArbitaryHeaders 
{
	public static void main (String args[])
	{
		String url = "https://www.oreilly.com";
		
		
			 try {
				 URL u = new URL(url);
				 URLConnection uc = u.openConnection();
				 for (int j = 1; ; j++) {
				 String header = uc.getHeaderField(j);
				 if (header == null) break;
				 System.out.println(uc.getHeaderFieldKey(j) + ": " + header);
				 }
			 } catch (MalformedURLException ex) {
				 System.err.println(url + " is not a URL I understand.");
			 } catch (IOException ex) {
				 System.err.println(ex);
			 }
			 System.out.println();
	
	
	}

}
