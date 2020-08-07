package Ex171025;

/* 형식 변환오류 예외처리 */
public class Ex171025_3 {

	public static void main(String[] args) {
		String arr[] = { "23", "12", "998", "3.141592" };
		try { // for문은 한 구문이기때문에 같이 묶어야함
			for (int i = 0; i < arr.length; i++) {
				int j = Integer.parseInt(arr[i]);
				System.out.println("숫자로 변환된 값: " + j);
			}
		} catch (NumberFormatException e) {// 형식 예외
			System.out.println("정수로 변환불가");
		}

	}

}
