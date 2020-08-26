package Ex171023;

/* 열을 다르게 해서 출력하기 (이차원 배열) */
public class Ex171023_2 {

	public static void main(String[] args) {
		int arr[][] = new int[4][]; // 행은 무조건 정해줘야함
		arr[0] = new int[1]; // 0행은 열 1개
		arr[1] = new int[2]; // 1행은 열 2개
		arr[2] = new int[3]; // 2행은 열 3개
		arr[3] = new int[4]; // 3행은 열 4개

		System.out.println("2차원 배열에서 행의 길이 : " + arr.length);
		for (int i = 0; i < 4; i++) {
			System.out.println((i + 1) + " 행의 요소 수: " + arr[i].length);
		}
		// 배열에 값을 저장
		int i, j, k = 0;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		// 배열 출력
		for (i = 0; i < arr.length; i++) {
			for (int v : arr[i])
				System.out.print(v + " ");
			System.out.println();
		}

	}

}
