package Ex171102;

public class Ex171102_3 {
	int count = 10;
	static int num = 20;

	public int sum(int x, int y) {
		return x + y;
	}

	static int mul(int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {
		Ex171102_3 s = new Ex171102_3();
		int same = s.count;
		System.out.println(same);
		
		same = s.num;		// == Ex171102_3.num
		System.out.println(same);
		
		same = s.sum(5, 5);
		System.out.println(same);
		
		same = s.mul(5, 5);	// == Ex171102_3.mul
		System.out.println(same);

	}
}
