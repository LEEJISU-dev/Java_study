package Ex171211;

import java.io.*;

/* 파일 입출력
 * 	- 파일과 디렉터리
*/
public class Ex171211_7 {
	public static void dir(File fd) {
		String[] filename = fd.list();
		for (String s : filename) {
			File f = new File(fd, s);
			long t = f.lastModified();
			System.out.print(s);
			System.out.print("\t파일 크기: " + f.length());
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t);
		}
	}

	public static void main(String[] args) {
		File f1 = new File("C:\\windows\\system.ini");
		File f2 = new File("C:\\JISU\\java_sample");
		File f3 = new File("C:\\JISU");

		String res;
		if (f1.isFile()) {
			res = "파일";
		}else {
			res = "디렉터리";
		}
		System.out.println(f1.getPath() + "은 " + res + "입니다");
		if (!f2.exists()) {
			if (!f2.mkdir())// 존재하지 않으면 디렉터리 생성
				System.out.println("디렉터리 생성 실패");
		}
		if (f2.isFile()) {
			res = "파일";
		}else {
			res = "디렉터리";
		}
		System.out.println(f2.getPath() + "은 " + res + "입니다");
		dir(f3);

		f2.renameTo(new File("C:\\JISU\\javasample"));
		dir(f3);

	}

}
