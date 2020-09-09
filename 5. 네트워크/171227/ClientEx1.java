import java.io.*;
import java.net.*;

public class ClientEx1 {

	public static void main(String[] args) {
		Socket socket = null;
		try{
			//서버와 소켓으로 연결
			socket = new Socket("127.0.0.1", 9000);//서버주소 , 포트번호
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			String str = "안녕안녕 저는 ㅇㅇㅇ입니다";
			out.write(str.getBytes());
			
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
		}catch(IOException e){
			
		}

	}

}
