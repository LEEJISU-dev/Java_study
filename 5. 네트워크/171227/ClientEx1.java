import java.io.*;
import java.net.*;

public class ClientEx1 {

	public static void main(String[] args) {
		Socket socket = null;
		try{
			//������ �������� ����
			socket = new Socket("127.0.0.1", 9000);//�����ּ� , ��Ʈ��ȣ
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			String str = "�ȳ�ȳ� ���� �������Դϴ�";
			out.write(str.getBytes());
			
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
		}catch(IOException e){
			
		}

	}

}
