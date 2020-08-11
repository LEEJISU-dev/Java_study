package Ex171106;
/* 시간 출력 프로그램 */

class Time {
	private int hour;
	private int min;
	private int sec;

	Time() {
		this(0, 0, 0);
	}

	Time(int hour, int min, int sec) {
		setTime(hour, min, sec);
	}

	private void setTime(int hour, int min, int sec) {
		this.hour = ((hour >= 0 && hour < 24) ? hour : 0);// 시간 검증
		this.min = ((min >= 0 && min < 60) ? min : 0);
		this.sec = ((sec >= 0 && sec < 60) ? sec : 0);
	}

	// 재정의 (오버라이딩)
	public String toString() {
		return String.format("%02d : %02d : %02d", hour, min, sec);
		// 한자리만 들어오면 앞자리 0
	}
}

public class Ex171106_5 {

	public static void main(String[] args) {
		Time t = new Time();
		System.out.println(t);

		Time t2 = new Time(13, 27, 6);
		System.out.println(t2);

	}

}
