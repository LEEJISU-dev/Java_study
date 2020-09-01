package Ex171211;

import java.io.*;

/* 파일 입출력
 * 	- 바이너리 복사
*/
public class Ex171211_9 {

	public static void main(String[] args) {
		File src = new File("c:\\windows\\explorer.exe");
		File dst = new File("c:\\JISU\\explorer.bin");
		FileInputStream fi = null;
		FileOutputStream fo = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		int c;
		try {
			fi = new FileInputStream(src);
			fo = new FileOutputStream(dst);
			in = new BufferedInputStream(fi);
			out = new BufferedOutputStream(fo);
			while ((c = in.read()) != -1) {
				out.write((char) c);
			}
			in.close();
			out.close();
			fi.close();
			fo.close();
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}
