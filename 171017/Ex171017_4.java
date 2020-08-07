package Ex171017;

/* 1648년 부터 48달러를 매년 8%의 복리이자받을 경우 2017년의 수익 계산하는 프로그램 */
public class Ex171017_4 {

	public static void main(String[] args) {
		double d = 48;

		for (int y = 1648; y < 2017; y++) {

			d = d * 1.08;

		}
		System.out.printf("지금 현재(2017년)의 수익은 %20.2f입니다", d);
	}

}
