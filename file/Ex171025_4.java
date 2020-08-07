package Ex171025;

/* 배열 범위오류 예외처리 */
public class Ex171025_4 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {// 배열범위오류
			System.out.println("범위를 벗어남");
		}

	}

}
