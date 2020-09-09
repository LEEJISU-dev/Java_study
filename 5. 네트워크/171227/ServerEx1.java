import java.io.*;
import java.net.*;

public class ServerEx1 {//통신을 하려면 서버에는 서버소켓과 소켓 두개 필요
						//클라이언트는 소켓하나만 필요
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		Socket socket = null;
		
		try{
			ss = new ServerSocket(9000);
			socket = ss.accept();//통신이 오기를 기다린다(통신을 위한 소켓)
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
			
			String str = "안녕! ㅇㅇㅇ^^*";
			out.write(str.getBytes());
		}catch(IOException e){
			
		}
	}

}
