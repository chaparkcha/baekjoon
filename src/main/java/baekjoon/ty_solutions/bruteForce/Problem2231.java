package baekjoon.ty_solutions.bruteForce;

import java.util.Scanner;

public class Problem2231 {
	
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		int result = 0;

		for(int i=0; i<input; i++) {
            int sum = i;
            int x = i;

            while(x > 0) {
                sum += x%10;
                x /= 10;
            }
            if(sum == input) {
            	result = i;
                break;
            }
        }
		
		System.out.println(result);
	}
}
