package baekjoon;

import java.util.Scanner;

public class P2480 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int prize = 0;
		int max;
		if (a == b && b == c) {
			prize = 10000 + (a * 1000);
		} else if (a == b || a == c) {
			prize = 1000 + (a * 100);
		} else if (b == c) {
			prize = 1000 + (b * 100);
		} else {
			//prize = Math.max(a, Math.max(b, c)) * 100;
			
//			max = a;
//			if(max < b) max = b;
//			if(max < c) max = c;
//			prize = max * 100;
			 
			//max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
			 
			
			
		}

		System.out.println(prize);
	}

}
