package baekjoon;

import java.util.Scanner;

public class P10818 {

	public static void main(String[] args) {
		// 배열길이 : 5
		// 배열값 입력 : 20 10 35 30 7
		// 최소, 최대값 결과 : 7 35
		
		
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int arr[] = new int[len];
		
		int min = 0;
		int max = 0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			
			min = (arr[i] < min) ? arr[i] : min;
			max = (arr[i] > max) ? arr[i] : max;
		}
		
		System.out.printf("%d %d", min, max);
		
		
		

		
		

	}

}
