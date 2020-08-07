package Ex171025;

/* 예외처리 -> 1 2 3 true ArithmeticException 6 */
public class Ex171025_5 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4);

		// try-catch 마지막에 Exception의 catch를 사용하면 어떤 종류의 예외도 다 처리가능
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);

	}

}
