package Ex171030;
/* TV 클래스 */

class Tv {
	String color;
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

public class Ex171030_3 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1 channel :" + t1.channel);
		System.out.println("t2 channel :" + t2.channel);
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1 channel값은 7로 변경");

		System.out.println("t1 channel :" + t1.channel);
		System.out.println("t2 channel :" + t2.channel);

	}

}
