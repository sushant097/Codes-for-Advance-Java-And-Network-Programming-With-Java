package udpDatagramSocketExample;

//Java program to illustrate Server side
//Implementation using DatagramSocket
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UdpDatagramSocketServer {
	public static void main(String[] args) throws IOException {
		// Step 1 : Create a socket to listen at port 1234
		DatagramSocket ds = new DatagramSocket(1234);
		byte[] receive = new byte[65535];

		DatagramPacket DpReceive = null;
		while (true) {

			// Step 2 : create a DatgramPacket to receive the data.
			DpReceive = new DatagramPacket(receive, receive.length);

			// Step 3 : receive the data in byte buffer.
			ds.receive(DpReceive);	
			
			String str = new String(DpReceive.getData(), 0, DpReceive.getLength());

			System.out.println("Client:-" + str);

			// Exit the server if the client sends "bye"
			if (str.equals("bye")) {
				System.out.println("Client sent bye.....EXITING");
				break;
			}

			// Clear the buffer after every message.
			receive = new byte[65535];

		}
	}

}
