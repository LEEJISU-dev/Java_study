package Ex171208;
import java.util.*;

/* 컬랙션 List
 * 	- ArrayList
 * 	- 가장 긴 이름 찾기
*/
public class Ex171208_7 {

	public static void main(String[] args) {
ArrayList<String> a = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4;i++){
			System.out.print("이름을 입력하세요>>");
			String s = sc.nextLine();
			a.add(s);
		}
		
		for(int i=0; i<a.size();i++){
			String name = a.get(i);
			System.out.print(name+" ");
		}
		
		int longIndex = 0;
		for(int i=1; i<a.size();i++){
			if(a.get(longIndex).length()<a.get(i).length())
				longIndex =i;
		}
		System.out.println("\n가장 긴 이름은: "+a.get(longIndex));

	}

}
