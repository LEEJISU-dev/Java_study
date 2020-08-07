package Ex171030;
/* 두 수의 합과 차 */

class PlusMinus {
	int plus;	// 두 수의 합
	int minus;	// 두 수의 차

	public String plus(int x, int y) {
		plus = x + y;
		return "두수의 합은" + plus;
	}

	public String minus(int x, int y) {
		minus = x - y;
		return "두수의 차는" + minus;
	}
}

public class Ex171030_2 {

	public static void main(String[] args) {
		PlusMinus ob1 = new PlusMinus();
		String sum, minus;
		
		sum = ob1.plus(50, 30);		// 두 수의 합 구하기
		minus = ob1.minus(50, 30);	// 두 수의 차 구하기
		System.out.println(sum);
		System.out.println(minus);
	}

}
