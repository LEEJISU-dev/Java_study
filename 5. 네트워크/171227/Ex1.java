import java.io.*;
import java.net.*;

public class Ex1 {

	public static void main(String[] args) throws Exception{
		/*//예외처리 시켜줘야함
		InetAddress ia = InetAddress.getByName("www.naver.com");
		System.out.println(ia.getHostAddress());*/
		InetAddress ia[]= null;
		ia = InetAddress.getAllByName("www.naver.com");
		for(int i =0; i<ia.length;i++){
			System.out.println("주소: "+ia[i].getHostAddress());
			System.out.println("호스트 네임: "+ia[i].getHostName());
		}
	}
	

}
