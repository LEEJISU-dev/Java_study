package Ex171108;
/* toString() 메소드 */

class AAA {
	public int a;
}

public class Ex171108_1 {
	public String toString(){
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	
	public static void main(String[] args) {
		AAA aa = new AAA();
		System.out.println(aa);
		System.out.println(aa.toString());
		Integer ii = new Integer(99);
		System.out.println(ii);
		System.out.println(ii.toString());
	}

}
