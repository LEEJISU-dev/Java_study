package Ex171211;

import java.io.*;

/* 파일 입출력
 * 	- FileInputStream
*/
public class Ex171211_1 {

	public static void main(String[] args) {
		FileInputStream in = null;
		try {
			in = new FileInputStream("C:\\Windows\\system.ini");
			int c;
			while ((c = in.read()) != -1) {// 파일의 끝은 -1(Eof)를 반환함
				System.out.print((char) c);
			}
			in.close();	// 꼭 닫아주기
		} catch (IOException e) {
			System.out.println("IO error");
		}
	}

}
