package inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddresss {
	public static void main(String[] args) {
		try {
			// Query local address
			InetAddress inetAddresses1 = InetAddress.getByName("localhost");
			System.out.println(inetAddresses1);

			// Query website ip address
			InetAddress inetAddresses2 = InetAddress.getByName("www.orielly.com");
			System.out.println(inetAddresses2);

			System.out.println("Printing All address of orielly.com");

			InetAddress[] addresses = InetAddress.getAllByName("www.orielly.com");
			for (InetAddress address : addresses) {
				System.out.println(address);
			}
			System.out.println("Done!");

			// Query local address
			InetAddress inetAddresses3 = InetAddress.getLocalHost();
			System.out.println(inetAddresses3);

			// common method
//			System.out.println(inetAddresses2.getAddress());
			System.out.println(inetAddresses2.getCanonicalHostName());// Canonical name
			System.out.println(inetAddresses2.getHostAddress());// ip
			System.out.println(inetAddresses2.getHostName());// Domain name, or the name of your
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
