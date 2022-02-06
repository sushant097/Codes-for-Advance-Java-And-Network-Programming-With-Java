package urlclass;

import java.io.*;
import java.net.*;

public class SecureSourceViewer {

	public static void main(String[] args) 
	{

		Authenticator.setDefault(new DialogAuthenticator());
		String loginUrl = "https://www.youtube.com/watch?v=DfJlZiCtZms";
			
	
			 try {
			 // Open the URL for reading
			 URL u = new URL(loginUrl);
			 try (InputStream in = new BufferedInputStream(u.openStream())) {
			 // chain the InputStream to a Reader
			 Reader r = new InputStreamReader(in);
			 int c;
			 while ((c = r.read()) != -1) {
			 System.out.print((char) c);
			 }
			 }
			 } catch (MalformedURLException ex) {
			 System.err.println(args[0] + " is not a parseable URL");
			 } catch (IOException ex) {
			 System.err.println(ex);
			 }
			 
			 }
	

}
