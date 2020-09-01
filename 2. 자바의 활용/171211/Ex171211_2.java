package Ex171211;

import java.io.*;

/* 파일 입출력
 * 	- FileOutputStream
*/
public class Ex171211_2 {

	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream("C:\\JISU\\test.out");
			FileInputStream fin = null;
			
			// 파일 내용 쓰기
			for (int i = 0; i < 10; i++) {
				int n = 10 - i;
				f.write(n);
			}
			f.close();

			fin = new FileInputStream("C:\\JISU\\test.out");
			int c = 0;
			// 파일 내용 읽기
			while ((c = fin.read()) != -1) {
				System.out.print(c + " ");
			}

		} catch (IOException e) {
			System.out.println("IO error");
		}
	}

}
