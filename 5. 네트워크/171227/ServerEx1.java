import java.io.*;
import java.net.*;

public class ServerEx1 {//����� �Ϸ��� �������� �������ϰ� ���� �ΰ� �ʿ�
						//Ŭ���̾�Ʈ�� �����ϳ��� �ʿ�
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		Socket socket = null;
		
		try{
			ss = new ServerSocket(9000);
			socket = ss.accept();//����� ���⸦ ��ٸ���(����� ���� ����)
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
			
			String str = "�ȳ�! ������^^*";
			out.write(str.getBytes());
		}catch(IOException e){
			
		}
	}

}
