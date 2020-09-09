import java.io.*;
import java.net.*;

public class ClientEx3 {

	public static void main(String[] args) {
		
		try{
			Socket socket = new Socket("192.168.10.9", 9002);
			Thread thread1 = new SenderThread1(socket, args[0]);
			Thread thread2 = new ReceiverThread1(socket);
			thread1.start();
			thread2.start();
		}catch(Exception e){
			
		}

	}

}
