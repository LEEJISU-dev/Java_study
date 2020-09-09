import java.io.*;
import java.net.*;

public class SenderThread1 extends Thread{
	Socket socket;
	String name;
	SenderThread1(Socket socket, String name){
		this.socket = socket;
		this.name = name;
	}
	public void run(){
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			while(true){
				String str = reader.readLine();
				if(str.equals("bye"))
					break;
				writer.println(str);
				writer.flush();
			}
		}catch(Exception e){
			
		}
	}
}
