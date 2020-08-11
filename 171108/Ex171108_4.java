package Ex171108;
/* getter setter */

class Person {
	private String phone;

	// getter(값불러오기) setter(값저장)
	// 마우스->source->getter setter
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}

// 상속
class Teacher extends Person {
	public String getPhone() {
		return "teacher: " + super.getPhone();
	}
}

public class Ex171108_4 {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setPhone("010-1111-1111");
		System.out.println(t.getPhone());

	}

}
