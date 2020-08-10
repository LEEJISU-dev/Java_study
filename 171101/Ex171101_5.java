package Ex171101;
/* 생성자 오버로딩 예 5
 * 환율 계산하기
 * static 활용 */

class Coverter {
	private static double rate;	// 한국 원화에 대한 환율

	public static double toDollar(double won) {
		return won / rate;
	}

	public static double toKWR(double dollar) {
		return dollar * rate;
	}

	public static void setRate(double r) {
		rate = r;	// 환율설정. KWR/$1
	}
}

public class Ex171101_5 {

	public static void main(String[] args) {
		Coverter.setRate(1120);

		System.out.println("백만원은 " + Coverter.toDollar(1000000) + "달러입니다");
		System.out.println("백달러는 " + Coverter.toKWR(100) + "원 입니다.");

	}

}
