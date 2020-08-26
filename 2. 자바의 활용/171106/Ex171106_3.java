package Ex171106;
/* 메소드 오버로딩
 * 램프 전원 프로그램 */

class Lamp {
	private boolean isOn;

	public void turnOn() {
		isOn = true;
	}

	public void turnOff() {
		isOn = false;
	}

	public String toString() {
		return "현재상태: " + (isOn == true ? "켜짐" : "꺼짐");
	}
}

public class Ex171106_3 {

	public static void main(String[] args) {
		Lamp l = new Lamp();
		l.turnOn();
		System.out.println(l);
		l.turnOff();
		System.out.println(l);

	}

}
