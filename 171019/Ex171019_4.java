package Ex171019;

import java.util.Scanner;

/* 입력받은 값의 최소값, 최대값 구하기 */
public class Ex171019_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];	// 입력받은 값
		int max = 0; 			// 가장 작은값
		int min = 100;			 // 가장 큰값
		
		System.out.println("값을 입력하세요(5개/최대 100)");
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "의 값: ");
			arr[i] = sc.nextInt();
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("입력된 값 중 가장 큰 값은 " + max);
		System.out.println("입력된 값 중 가장 작은 값은 " + min);
		/*최소값 최대값 입력받은 것을 초기값으로 놓기

		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		int max, min;
		System.out.println("값을 입력하세요(5개/최대 100)");
		for(int i=0; i<5;i++){
			System.out.println((i+1)+"의 값: ");
			arr[i]= sc.nextInt();
		}
			max = arr[0];
			min =arr[0];
			for(int i=1;i<5;i++){
			if(arr[i] < min)
				min = arr[i];
			if(arr[i] > max)
				max = arr[i];
			}
		
		System.out.println("입력된 값 중 가장 큰 값은 "+max);
		System.out.println("입력된 값 중 가장 작은 값은 "+min);*/
	}

}
