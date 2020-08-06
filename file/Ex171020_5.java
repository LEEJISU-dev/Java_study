package Ex171020;

import java.util.Arrays;

/* 불연속적인 범의의 값들로 배열 채우기  */
public class Ex171020_5 {

	public static void main(String[] args) {
		int code[]={-4, -1, 3, 6, 11};
		int arr[]= new int[10];
		
		for(int i=0; i<arr.length;i++){
			int tmp =(int)(Math.random()*code.length);
			arr[i]=code[tmp];
		}
		System.out.println(Arrays.toString(arr));//배열 출력함수
	}

}
