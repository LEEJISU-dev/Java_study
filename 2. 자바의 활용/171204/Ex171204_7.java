package Ex171204;

/* Thread
 * 		- 메인의 thread값들
*/
public class Ex171204_7 {

	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();

		System.out.println("name : " + name);		// main
		System.out.println("id: " + id);			// 1
		System.out.println("priority: " + priority);// 5(초기값)
		System.out.println("state: " + s);			// runnable

	}

}
