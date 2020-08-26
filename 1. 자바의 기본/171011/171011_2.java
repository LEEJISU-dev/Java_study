import java.util.Scanner;

/* 초 입력시 몇시 몇분 몇초인지 알려주는 프로그램 */
public class Ex171011_2 {
	public static void main(String[] args) {
		int hour;	//시간
		int min;	//분
		int sec;	//초
		int time;	//입력받은 시간(초)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하세요(정수): \n");
		time = sc.nextInt();
		
		sec = time % 60;
		min = (time / 60) % 60;
		hour = (time / 60) / 60;
		
		System.out.println(hour+"시간 "+min+"분 "+sec+"초 입니다.");
	}
}
