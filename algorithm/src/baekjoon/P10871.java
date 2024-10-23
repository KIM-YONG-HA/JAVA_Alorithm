package baekjoon;

import java.util.Scanner;

public class P10871 {

	public static void main(String[] args) {
		
//		length 기준수 입력 : 10 5
//		배열값 저장 : 1 10 4 9 2 3 8 5 7 6
//		결과 : 1 4 2 3 
		
		Scanner sc = new Scanner(System.in);
		int[] arr = null;
		int len, num;
		
		len = sc.nextInt();
		num = sc.nextInt();
		arr = new int[len];
		
		for(int i=0;i<len;i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] < num) {
			 if(i < num) System.out.print(arr[i]+" "); else System.out.print(arr[i]); 
				
			}
				
		}
		
		
		
		
	}

}
