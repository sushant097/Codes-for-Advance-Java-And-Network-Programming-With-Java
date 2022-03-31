package udpDatagramPacketMethods;


//Java program to illustrate various
//DatagramPacket class methods
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Arrays;

public class SetGetMethodsUDPDemo 
{
	public static void main(String[] args) throws IOException
    {
 
        byte ar[] = { 12, 13, 15, 16 };
        byte buf[] = { 15, 16, 17, 18, 19 };
        InetAddress ip = InetAddress.getByName("localhost");
         
        // DatagramPacket for sending the data
        // (byte[] buf, length, address, port)
        DatagramPacket dp1 = new DatagramPacket(ar, 4, ip, 1052); 
        
        // setAddress() method
        // I have used same address as in initiation
        dp1.setAddress(ip);
 
        // getAddress() method
        System.out.println("Address : " + dp1.getAddress());
        
        // setPort() method
        dp1.setPort(2525);
         
        // getPort() method
        System.out.println("Port : " + dp1.getPort());
         
        // setLength() method
        dp1.setLength(4);
         
        // getLength() method
        System.out.println("Length : " + dp1.getLength());
         
        // setData() method
        dp1.setData(buf);
         
        // getData() method
        System.out.println("Data : " + Arrays.toString(dp1.getData()));
         
        // setSocketAddress() method
//        dp1.setSocketAddress(dp1.getLocalSocketAddress());
         
        // getSocketAddress() method
        System.out.println("Socket Address : " + dp1.getSocketAddress());
 
        // getOffset() method
        System.out.println("Offset : " + dp1.getOffset());
        
        
    }
	

}
