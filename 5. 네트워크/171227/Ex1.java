import java.io.*;
import java.net.*;

public class Ex1 {

	public static void main(String[] args) throws Exception{
		/*//����ó�� ���������
		InetAddress ia = InetAddress.getByName("www.naver.com");
		System.out.println(ia.getHostAddress());*/
		InetAddress ia[]= null;
		ia = InetAddress.getAllByName("www.naver.com");
		for(int i =0; i<ia.length;i++){
			System.out.println("�ּ�: "+ia[i].getHostAddress());
			System.out.println("ȣ��Ʈ ����: "+ia[i].getHostName());
		}
	}
	

}
