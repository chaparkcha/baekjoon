package baekjoon.ty_solutions.bruteForce;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2798 {
	
	public void solution() {
		Scanner sc = new Scanner(System.in);

		String [] input = sc.nextLine().split(" ");
		String [] cardList = sc.nextLine().split(" ");
		sc.close();
		
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		ArrayList<Integer> card = new ArrayList<>();

		for(String num: cardList) {
			card.add(Integer.parseInt(num));
		}

		int max = 0;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1; j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					int sum = card.get(i)+card.get(j)+card.get(k);
					if(sum <= m) {
						max = Math.max(max, sum);
					}
					if(max == m) {
						System.out.println(max);
						return;
					}
				}
			}
		}
		System.out.println(max);
		
	}
}
