package Ex171106;

/* 문자열 함수 */
public class Ex171106_1 {

	public static void main(String[] args) {
		String word = "I LOVE YOU";
		String s1, s2, s3, s4, s5;

		System.out.println(word.length());	// 공백포함
		
		s1 = word.toLowerCase();			// 소문자
		System.out.println(s1);
		
		s2 = word.toUpperCase();			// 대문자
		System.out.println(s2);
		
		s3 = word.concat(" so much <3");	// 문자열끼리 결합
		System.out.println(s3);
		
		s4 = word.replace("LOVE", "Hate");	// 바꾸기
		System.out.println(s4);
		
		s5 = word.substring(2, 6);			// 인덱스0부터 시작, 6앞까지 문자열 추출
		System.out.println(s5);

	}

}
