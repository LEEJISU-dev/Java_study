package Ex171109;
/* 다형성 예제 */

class Am {
	int count = 1;

	void callme() {
		System.out.println("Am 실행, count: " + count);
	}
}

class Bm extends Am {
	int count = 2;

	void callme() {
		System.out.println("Bm 실행, count: " + count);
	}
}

class Cm extends Am {
	int count = 3;

	void callme() {
		System.out.println("Cm 실행, count: " + count);
	}
}

public class Ex171109_2 {

	public static void main(String[] args) {
		Am r = new Am();
		r.callme();
		System.out.println("r.count: " + r.count);

		r = new Bm();
		r.callme();
		System.out.println("r.count: " + r.count);

		r = new Cm();
		r.callme();
		System.out.println("r.count: " + r.count);

	}

}
