package inetAddress;

import java.net.*;

public class GetLocalHost 
{
	public static void main(String[] args)
	{
		try {
			InetAddress address = InetAddress.getLocalHost();
			String localhost = address.getHostName();
			String localhost_can = address.getCanonicalHostName();
			String dottedQuad = address.getHostAddress();

			System.out.println(address);
			System.out.println(localhost);
			System.out.println(localhost_can);
			System.out.println("My address is " + dottedQuad);
		}catch(UnknownHostException ex) {
			System.out.println("Could not find this computer's address");
			
		}
	}

}
