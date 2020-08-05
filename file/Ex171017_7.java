package Ex171017;
/* 짝수, 홀수, 제곱, 역수, 순환, 반복 나타내기 (1-10까지) */
public class Ex171017_7 {

	public static void main(String[] args) {
		System.out.println("i \t 짝수 \t 홀수 \t 제곱 \t 역수 \t 순환 \t 반복");
		System.out.println("--------------------------------------------------------");
		
		for(int i=1;i<=10;i++)
			System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d\n", 
					i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
	}

}
