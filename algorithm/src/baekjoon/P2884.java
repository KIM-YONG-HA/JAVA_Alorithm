package baekjoon;

import java.util.Scanner;

public class P2884 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int hour, minute, calc;
		
		// -45분하기 
		// 10 10 => 600m + 10m => 610m
		//   -45 => 610m - 45m => 565m
		//  9 25 => 565/60 =>9, 565%60 => 25
		
		// 1 30 => 13 * 60 + 30 => 810
		
		if(h == 0) h = 24;
		calc = h * 60 + m - 45;
		
		hour = calc/60;
		minute = calc%60;
		if(hour == 0) hour = 23;
		
		System.out.println(hour + " "+ minute);
		
		
		
		
	}

}
