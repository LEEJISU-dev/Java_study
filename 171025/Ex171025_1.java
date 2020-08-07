package Ex171025;

import java.io.FileReader;

/* 예외처리 예제 1(파일입출력) */
public class Ex171025_1 {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("a.txt");
			int i;
			while ((i = file.read()) != -1) {
				System.out.print((char) i);
			}
			file.close();
		} catch (Exception e) {
			System.out.println("예외처리 루틴: " + e + "파일이 존재하지 않음");
		}

	}

}
