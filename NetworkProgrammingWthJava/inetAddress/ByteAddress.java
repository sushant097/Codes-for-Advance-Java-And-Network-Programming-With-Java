package inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ByteAddress 
{

	public static void main(String[] args) 
	{
		
		byte[] address = {107, 23, (byte) 216, (byte) 195}; // greater than 127 should converted into byte; 
		// Java have no unsigned byte primitive data type and Bytes with values higher than 127 are treated as negative numbers
		try {
			InetAddress lessWrong = InetAddress.getByAddress(address);
			InetAddress lesssWrongWithname = InetAddress.getByAddress("lesswrong.com", address);
			System.out.println("1: "+ lessWrong);
			System.out.println("2: "+ lesssWrongWithname);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
