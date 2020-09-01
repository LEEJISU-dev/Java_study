package Ex171211;

import java.io.*;

/* 파일 입출력
 * 	- 파일 한글로 불러오기 ->"MS949"
*/
public class Ex171211_3 {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\JISU\\han.txt");
			in = new InputStreamReader(fin, "MS949");
			int c;

			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
