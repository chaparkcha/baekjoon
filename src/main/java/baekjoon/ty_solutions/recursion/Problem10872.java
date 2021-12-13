package baekjoon.ty_solutions.recursion;

import java.util.Scanner;

public class Problem10872 {
	
	public int solution() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = factorial(num);
		sc.close();
		
		return result;
	}
	
	public int factorial(int fac) {
		if (fac <= 1) {
			return 1;
		}
		
		return fac * factorial ( fac - 1 );
	}
	
}
