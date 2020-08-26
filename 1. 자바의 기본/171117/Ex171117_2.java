package Ex171117;
/* 배열 예제 2
 * 369게임 */
public class Ex171117_2 {

	public static void main(String[] args) {
		String[] arr = { "박수 한번 ", "박수 두번" };
		int res, num, count = 0;
		for (int i = 1; i < 100; i++) {
			num = i;
			for (res = num % 10; num > 0; res = num % 10) {	// 369가 들어있는지 판정
				if (res == 3 || res == 6 | res == 9)
					count++;	// 박수의 수를 결정
				num = num / 10;
			}
			if (count > 0)
				System.out.println(i + " " + arr[count - 1]);
			count = 0;
		}
	}

}
