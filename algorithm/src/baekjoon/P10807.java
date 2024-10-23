package baekjoon;

import java.util.Scanner;

public class P10807 {

	public static void main(String[] args) {
//		배열 개수 : 11
//		배열 값 입력 : 1 4 1 2 4 2 4 2 3 4 4
//		검색값 : 2
//		검색값 카운트 결과 : 3
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		int cnt = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] == b) cnt++;
			
		}
		
		System.out.println(cnt);
		

	}

}
