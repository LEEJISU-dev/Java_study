import java.io.*;
import java.net.*;

public class Ex2 {

	public static void main(String[] args) {
		//내부통신에 필요한 서버소켓 /그냥 소켓은 서로 통신을 위해 필요 
		//통신을 위해서는 두개의 소켓(서버소켓/소켓)필요
		ServerSocket ss = null;
		
		for(int i =1; i<=65535;i++ ){
			try{
				ss = new ServerSocket(i);
				ss.close();
			}catch(IOException e){
				System.out.println(i+"번 포트 사용중");
			}
		}

	}

}
