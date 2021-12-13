package baekjoon.ty_solutions.recursion;

import java.util.Scanner;

public class Problem10870 {
	
	public int solution() {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = fibonacci(num);
		sc.close();
		
		return result;
	}
	
	public int fibonacci(int fibo) {
		if (fibo <= 1) {
			return fibo;
		} else {
			return fibonacci( fibo-2 ) + fibonacci ( fibo-1 );
		}
	}
	
}
