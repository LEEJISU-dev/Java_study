package Ex171017;
/* 동시에 숫자 1-10 10-1까지 출력하는 프로그램 */
public class Ex171017_6 {

	public static void main(String[] args) {
		// 초기화와 증감식은 두개 이상 쓰기 가능함
		for(int i=1, j=10;i<=10;i++, j--){
			System.out.printf("%d \t %d\n" , i, j);
		}

	}

}
