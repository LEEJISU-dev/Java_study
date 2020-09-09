import java.io.*;
import java.net.*;

public class ReceiverThread1 extends Thread{
	Socket socket = null;
	public ReceiverThread1(Socket socket) {
		this.socket = socket;
	}
	public void run(){
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true){
				String str = reader.readLine();
				if(str == null) break;
				System.out.println(str);
			}
		}catch(Exception e){
			
		}
	}

}
