package Ex171211;

import java.io.*;

/* 파일 입출력
 * 	- 파일 복사
*/
public class Ex171211_8 {

	public static void main(String[] args) {
		File src = new File("c:\\windows\\system.ini");
		File dst = new File("c:\\JISU\\system.txt");
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		int c;
		try {
			fr = new FileReader(src);
			fw = new FileWriter(dst);
			in = new BufferedReader(fr);
			out = new BufferedWriter(fw);
			while ((c = in.read()) != -1) {
				out.write((char) c);
			}
			in.close();
			out.close();
			fr.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}
