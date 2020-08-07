package Ex171024;

/* 369게임 */
public class Ex171024_3 {

	public static void main(String[] args) {
		String arr[] = { " 박수 짝", "박수 짝짝" };
		int res, num, k = 0;

		for (int i = 1; i < 100; i++) {
			num = i;
			for (res = num % 10; num > 0; res = num % 10) {
				if (res == 3 || res == 6 || res == 9)
					k++;
				num = num / 10;
			}
			if (k > 0)
				System.out.println(i + arr[k - 1]);
			k = 0;
		}

	}

}
