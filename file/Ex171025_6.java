package Ex171025;
/* 강제 예외 발생시키기, 예외전가 */

class AA {
	void aa() throws Exception {
		BB b = new BB();
		b.bb();
	}
}

class BB {
	void bb() throws Exception { // 예외 전가 시킴
		Exception e = new Exception("강제 예외발생");
		throw e;// 예외 강제 발생
		// =throw new Exception("강제 예외 발생");

	}
}

public class Ex171025_6 {
	public static void main(String[] args) throws Exception {
		AA a = new AA();
		a.aa();

	}

}
