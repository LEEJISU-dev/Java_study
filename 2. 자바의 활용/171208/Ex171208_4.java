package Ex171208;

import java.util.*;

/* 컬랙션 List
 * 	- ArrayList
*/
public class Ex171208_4 {

	public static void main(String[] args) {
		final int LIMIT = 10;
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();

		List list = new ArrayList<>(length / LIMIT + 10);

		for (int i = 0; i < length; i += LIMIT) {
			if (i + LIMIT < length)
				list.add(source.substring(i, i + LIMIT));
			else
				list.add(source.substring(i));
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
