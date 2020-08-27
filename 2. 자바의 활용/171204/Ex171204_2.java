package Ex171204;
/* Thread 
 * 		- 2개의 thread호출시 -> 순서X 
*/

class MyThread extends Thread {
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.print("A" + i + " ");
		}
	}

}

public class Ex171204_2 {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		MyThread t1 = new MyThread();
		// t.run();//메소드 호출

		// thread호출하면 두개가 동시에 돌아가서 순서가 매번 달라진다
		t.start();// run이라는 thread호출
		t1.start();
	}

}
