package baekjoon.ty_solutions.bruteForce;

import java.util.Scanner;

public class Problem2231 {
	
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		int x = 0;
		boolean exit = false;

		for(int i=1;i<=input;i++) {
			for(int j=1; j<=input;j++) {
				for(int k=1;k<=input;k++) {
					x = Integer.parseInt(i+""+j+""+k);
					if(input == (x+i+j+k)) {
						System.out.println(i+""+j+""+k+" String");
						exit = true;
						break;
					}
				}
				if(exit) break;
			}
			if(exit) break;
		}
		
		if(exit) {
			System.out.println(x);
		} else {
			System.out.println("0");
		}
		
		
	}
}
