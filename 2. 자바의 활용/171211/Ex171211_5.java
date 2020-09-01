package Ex171211;

import java.io.*;

/* 파일 입출력
 * 	- 파일 쓰기
 * 	- FileWriter
*/
public class Ex171211_5 {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);

		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("C:\\JISU\\test.txt");
			while ((c = in.read()) != -1) {
				fout.write(c);
			}
			in.close();
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
