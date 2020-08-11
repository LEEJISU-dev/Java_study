package Ex171108;
/* toString()메소드 2 */

class AA{
	public int a;
	public String toString(){//오버라이딩
		return "AAA 클래스 객체, 속성 a의 값은:"+a;
	}
}
public class Ex171108_2 {

	public static void main(String[] args) {
		AA aa = new AA();
		System.out.println(aa);
		System.out.println(aa.toString());

	}

}
