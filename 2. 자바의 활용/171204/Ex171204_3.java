package Ex171204;

/* runnable  
 * 		- 2개의 runnable호출시 -> 순서O
*/
class MyRunnable implements Runnable {
	String Name;

	public MyRunnable(String name) {
		Name = name;
	}

	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.print(Name + i + " ");
		}

	}

}

public class Ex171204_3 {

	public static void main(String[] args) {
		// MyRunnable t1 = new MyRunnable("A"); ->상속

		// 인터페이스일 경우 thread 객체 생성해서 만들어야 함!!(인터페이스는 생성자를 만들 수 없기 때문)
		Thread t1 = new Thread(new MyRunnable("A"));
		Thread t2 = new Thread(new MyRunnable("B"));

		t1.start();
		t2.start();
	}

}
