package Ex171207;
import java.util.*;

/* 컬랙션 set
 * 	- HashSet
 * 	- 5 * 5 랜덤 빙고판
*/
public class Ex171207_5 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		int[][] board = new int[5][5];

		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 50) + 1 + "");
		}
		Iterator it = set.iterator();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}

	}

}
