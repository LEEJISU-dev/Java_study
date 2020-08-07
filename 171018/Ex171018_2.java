package Ex171018;

/* *찍기프로그램 ->6줄부터는 6개만 찍기(break) */
public class Ex171018_2 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i; j++) {
				if (j > 6)
					break;
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
