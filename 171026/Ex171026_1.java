package Ex171026;
/*  run-> run Configurations -> Arguments 5 7입력 */
public class Ex171026_1 {

	public static void main(String[] ar) {
		System.out.println("매개 변수로 받은 두 수의 합은: "+ar[0]+ar[1]);
		int a = Integer.parseInt(ar[0]);

		int b = Integer.parseInt(ar[1]);
		
		System.out.println("두 수의 합은:"+(a+b));
	}

}
