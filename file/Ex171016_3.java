package Ex171016;
/* a ~ z까지 출력하는 프로그램 */
public class Ex171016_3 {

	public static void main(String[] args) {
		char ch = 'a';
		
		do {
			System.out.println(ch);
			ch++;	//ch = (char)(ch+1);
		}while(ch <= 'z');

	}

}
