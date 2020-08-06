package Ex171019;

/* 배열생성, 값넣기 */
public class Ex171019_2 {

	public static void main(String[] args) {
		int score[] = new int[5];
		int k = 1;
		score[0] = 50;
		score[1] = 60;
		score[k + 1] = 40;
		score[3] = 0;
		score[4] = 100;

		for (int i = 0; i < 5; i++) { // i<score.length
			System.out.print(score[i]);
			System.out.print("\t");
		}
		/*배열 생성과 초기화 동시에하기(동적배열)
		int score[] =new int[] {10,30};

		int b[][]={{1,2,3},{1,2,3}};*/

	}

}
