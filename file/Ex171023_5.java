package Ex171023;
/*10 11 12
  20 21
  30 31 32   
  40 41
   출력하기*/
public class Ex171023_5 {

	public static void main(String[] args) {
		int arr[][] = new int[4][]; // 행은 무조건 정해줘야함
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[2];

		/*
		 * int i, j, k = 10; for (i = 0; i < arr.length; i++) { for (j = 0; j <
		 * arr[i].length; j++) { arr[i][j] = k; k++; } if (k % 2 == 0) k = k - 2; else
		 * if (k % 2 != 0) k = k - 3; k = k + 10; }
		 */
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 1) * 10 + j;
			}
		}

		for (int tmp[] : arr) {
			for (int v : tmp)
				System.out.print(v + " ");
			System.out.println();
		}

	}

}
