package baekjoon;

import java.util.Scanner;

public class P2884 {

	public static void main(String[] args) {
		
		// 1. 시 분 입력
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int calc;
		
		// 2. 분 계산
		// 45분을 빼서 음수면 => h--, m+60
		// h가 0 이면 => 23
		
		calc = m - 45;
		if(calc<0) {
			
			m = calc + 60;
			
		}
		
		
		if(h==0) h=24;
		h--;
		
		// 3. 최종 출력
		System.out.printf("%d %d",h,m);
		
		
		
	}

}
