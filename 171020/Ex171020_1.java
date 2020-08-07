package Ex171020;

/* 최대값 구하기(배열)
 * 확장된 For문
 * for(type변수명 : 배열이름) */
public class Ex171020_1 {

	public static void main(String[] args) {
		int score[] = { 88, 98, 56, 67, 98, 56, 78 };
		int max = score[0];
		for (int i : score) { // 확장된 for문 ,for(int i; i<score.length;i++)
			if (i > max) // if(score[i] >max)
				max = i;
		}
		System.out.println("max :" + max);
	}

}
