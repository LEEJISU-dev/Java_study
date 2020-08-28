package Ex171207;
import java.util.*;

/* 컬랙션 set
 * 	- HashSet의 중복여부
*/
public class Ex171207_3 {

	public static void main(String[] args) {
		Object[] o = {"1",new Integer(1),"2","2", "3","4"};
		HashSet s= new HashSet();
		
		for(int i=0; i<o.length;i++){
			s.add(o[i]);
		}
		System.out.println(s);
	}

}
