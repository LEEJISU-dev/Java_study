package Ex171102;
/* return
 * 반환되는 값의 형을 클래스 이름으로 하면 클래스의 객체를 반환 한다.
 * Ex) public Box compute(){
	...
	return v_box;
}
 */

class Box11 {
	private int iv;		// 상자 부피(int)
	private double dv;	// 상자 부피(double)

	public Box11(int w, int h, int d) {
		volume(w, h, d);
	}

	public Box11(double w, double h, double d) {
		volume(w, h, d);
	}

	private void volume(int w, int h, int d) {
		iv = w * h * d;
	}

	private void volume(double w, double h, double d) {
		dv = w * h * d;
	}

	public int getIv() {
		return iv;
	}

	public double getDv() {
		return dv;
	}

}

public class Ex171102_1 {

	public static void main(String[] args) {
		Box11 mb = new Box11(10, 20, 30);
		System.out.println("박스의 부피:" + mb.getIv());
		
		mb = new Box11(10.5, 20.5, 30.5);
		System.out.println("박스의 부피:" + mb.getDv());
		
		mb = new Box11(10, 20, 30.5);
		System.out.println("박스의 부피:" + mb.getDv());
	}

}
