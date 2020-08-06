package Ex171020;

/* 배열의 복사 */
public class Ex171020_2 {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30 };
		int b[] = { 40, 50, 60 };
		b = a; // 배열명을 이용해서 복사
		b[2] = 200;
		System.out.print("a배열의 값 :");
		for (int i : a)
			System.out.print(i + " ");
		System.out.print("\nb배열의 값 :");
		for (int i : b)
			System.out.print(i + " ");

		int c[] = { 100, 200, 300 };
		int d[] = { 400, 500, 600 };
		for (int i = 0; i < c.length; i++)// 배열요소의 값을 각각 복사
			d[i] = c[i];
		d[2] = 999;
		System.out.print("\nc배열의 값 :");
		for (int i : c)
			System.out.print(i + " ");
		System.out.print("\nd배열의 값 :");
		for (int i : d)
			System.out.print(i + " ");

	}

}
