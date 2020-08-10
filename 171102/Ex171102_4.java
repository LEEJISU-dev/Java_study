package Ex171102;
/* 정사각형, 직사각형, 직육면체의 넓이 구하기 */

class Overload {
	public void calc() {
		System.out.println("매개변수가 없음");
	}

	public void calc(int w) {
		System.out.println("정사각형의 넓이:" + w * w);
	}

	public void calc(int w, int h) {
		System.out.println("직사각형의 넓이:" + w * h);
	}

	public void calc(int w, int h, int d) {
		System.out.println("직육면체의 넓이:" + w * h * d);
	}
}

public class Ex171102_4 {

	public static void main(String[] args) {
		Overload ol = new Overload();
		int input[] = new int[args.length];
		for (int i = 0; i < args.length; i++)
			input[i] = Integer.parseInt(args[i]);
		switch (args.length) {
		case 0:
			ol.calc();
			break;
		case 1:
			ol.calc(input[0]);
			break;
		case 2:
			ol.calc(input[0], input[1]);
			break;
		case 3:
			ol.calc(input[0], input[1], input[2]);
			break;
		default:
			System.out.println("인수의 개수가 많습니다");
		}
	}

}
