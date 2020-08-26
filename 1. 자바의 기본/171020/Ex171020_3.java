package Ex171020;

/* 배열 역순 배치하기(swap) */
public class Ex171020_3 {

	public static void main(String[] args) {
		String a[] = { "seoul", "daejeon", "daegu", "kwangju", "inchon", "jeju", "busan" };
		System.out.print("원래의 배열: ");
		for (String s : a)
			System.out.print(s + " ");
		System.out.println();
		
		for (int i = 0; i < a.length / 2; i++) {
			String temp = a[i];			// 배열의 처음값을 temp에 저장
			a[i] = a[a.length - i - 1]; // 처음 배열에 마지막값을 저장
			a[a.length - i - 1] = temp; // temp값을 마지막값에 저장
		}
		System.out.print("역순으로 재배치한 배열 :");
		for (String s : a)
			System.out.print(s + " ");
	}

}
