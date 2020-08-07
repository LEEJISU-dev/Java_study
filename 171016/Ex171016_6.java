package Ex171016;

/* 누적 합계가 100을 넘지 않는 가장 큰 수 찾기 */
public class Ex171016_6 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		while ((sum += ++i) <= 100) {
			System.out.printf("%d - %d\n", i, sum);
		}

	}

}
