package Ex171211;

import java.io.*;

/* 파일 입출력
 * 	- FileReader(문자입출력)
*/
public class Ex171211_4 {

	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("C:\\Windows\\system.ini");
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("입출력오류");
		}
	}

}
