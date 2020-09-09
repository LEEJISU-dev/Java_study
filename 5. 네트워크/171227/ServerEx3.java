import java.io.*;
import java.net.*;

public class ServerEx3 {

	public static void main(String[] args) {
		ServerSocket ss = null;
		try{
			ss =new ServerSocket(9002);
			while(true){
				Socket socket = ss.accept();
				Thread thread1 = new PerClientThread(socket);
				thread1.start();
			}
		}catch(IOException e){
			
		}

	}

}
