package Ex171102;
/* 배열로 부피 구하기 */

class Box12 {
	private int iv;

	public Box12(int w, int h, int d) {
		iv = w * h * d;
	}

	public String getIv() {
		return "박스의 부피는 " + iv;
	}
}

public class Ex171102_2 {

	public static void main(String[] args) {
		Box12 mb[] = new Box12[10];
		for (int i = 0; i < mb.length; i++) {
			mb[i] = new Box12(i * 10, i * 20, i * 30);
		}
		for (Box12 b : mb) {// for(int i:mb)int 대신 객체
			System.out.println(b.getIv());
		}
	}

}
