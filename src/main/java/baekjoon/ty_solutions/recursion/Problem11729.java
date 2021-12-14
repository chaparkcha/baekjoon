package baekjoon.ty_solutions.recursion;

import java.util.Scanner;

public class Problem11729 {
	
	public void solution() {
		System.out.println("pro 11729 하노이탑");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println((int) Math.pow(2, n) - 1);
		hanoi_move(n, 1, 3, 2);
	}

	public void hanoi_move(int circle_cnt, int start_pillar, int end_pillar, int middle_pillar) {
		if(circle_cnt == 1) {
			System.out.println(start_pillar+" "+end_pillar);
		} else {
			hanoi_move(circle_cnt-1, start_pillar, middle_pillar, end_pillar);
			System.out.println(start_pillar+" "+end_pillar);
			hanoi_move(circle_cnt-1, middle_pillar, end_pillar, start_pillar);
		}
	}
}
