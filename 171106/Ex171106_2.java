package Ex171106;
/* 메소드 오버로딩 
 * 가변길이 변수*/

class Test {
	/*
	 * void sub(){ System.out.println("매개변수의 값 :0"); }
	 * 
	 * void sub(int x){ System.out.println("매개변수의 값 :"+x); }
	 * 
	 * void sub(int x, int y, int z, int i){ System.out.println("매개변수의 값 :"+x
	 * +y+z+i); }
	 */
	
	// 같은 형이면 오버로딩대신 사용(가변 길이 변수jdk1.5이상 가능)
	void sub(int... x) {
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}

public class Ex171106_2 {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.sub(1);
		t1.sub(2, 3, 4, 5);
		t1.sub();
	}

}
