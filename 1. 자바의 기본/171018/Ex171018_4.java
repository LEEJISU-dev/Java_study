package Ex171018;
/* 구구단 *2까지만 출력 (continueLabel문) */
public class Ex171018_4 {

	public static void main(String[] args) {
		aa : for(int i=2; i<=9;i++){
			System.out.println("---"+i+"단---");
			for(int j=1; j<=9;j++){
				if(j==3) continue aa;
				System.out.println(i+"*"+j+"="+i*j);
				}
			}

	}

}
