
package inetAddress;

import java.net.*;
import java.util.*;

/**
 * @author SushantGautam
 *
 */
public class NetworkInterfaceListener {

	public static void main(String[] args) {
		try {
			NetworkInterface ni = NetworkInterface.getByName("eth0");
			if (ni == null) {
				System.err.println("No such interface: eth0");
			}
			System.out.println(ni);
		} catch (SocketException ex) {
			System.err.println("Could not list sockets.");
		}
		System.out.println("-----LOCAL LOOPBACCK ADDRESS---------");

		try {
			InetAddress local = InetAddress.getByName("127.0.0.1");
			NetworkInterface ni = NetworkInterface.getByInetAddress(local);
			if (ni == null) {
				System.err.println("That's weird. No local loopback address.");
			}
			System.out.println(ni);
			
		} catch (SocketException ex) {
			System.err.println("Could not list network interfaces.");
		} catch (UnknownHostException ex) {
			System.err.println("That's weird. Could not lookup 127.0.0.1.");
		}
		System.out.println("------- ALL NETWORK INTERFACES : -------");

		Enumeration<NetworkInterface> interfaces;
		try {
			interfaces = NetworkInterface.getNetworkInterfaces();
			while (interfaces.hasMoreElements()) {
				NetworkInterface ni = interfaces.nextElement();
				System.out.println(ni);
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
