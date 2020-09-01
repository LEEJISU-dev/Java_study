package Ex171211;

import java.io.*;

/* 파일 입출력
 * 	- 버퍼 예제
 * 	- BufferedOutputStream
*/
public class Ex171211_6 {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		// 버퍼의 용량(5)
		BufferedOutputStream out = new BufferedOutputStream(System.out, 5);

		try {
			int c;
			while ((c = in.read()) != -1) {// ctrl-z입력할때까지 반복
				out.write(c);
			}
			out.flush();// 버퍼에 남아있는 문자 출력
			if (in != null) {
				in.close();
				out.close();
			}
		} catch (IOException e) {
			System.out.println("IO error");
		}

	}

}
