import java.io.*;
import java.net.*;

public class Ex2 {

	public static void main(String[] args) {
		//������ſ� �ʿ��� �������� /�׳� ������ ���� ����� ���� �ʿ� 
		//����� ���ؼ��� �ΰ��� ����(��������/����)�ʿ�
		ServerSocket ss = null;
		
		for(int i =1; i<=65535;i++ ){
			try{
				ss = new ServerSocket(i);
				ss.close();
			}catch(IOException e){
				System.out.println(i+"�� ��Ʈ �����");
			}
		}

	}

}
