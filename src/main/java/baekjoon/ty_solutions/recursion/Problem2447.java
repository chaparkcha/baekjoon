package baekjoon.ty_solutions.recursion;

import java.util.Scanner;

public class Problem2447 {

	public void solution() {
		System.out.println("pro 2447 ë³„ê·¸ë¦¬ê¸°");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if(!calculPossible(n)) {
			return;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				calculArry(i, j, n);
			}
			System.out.println();
		}
	}

	public void calculArry(int cal_i, int cal_j, int cal_n){
		
		if((cal_i/cal_n)%3==1 && (cal_j/cal_n)%3==1) {
			System.out.print(" ");
		} else {
			if (cal_n != 1) {
				calculArry(cal_i, cal_j, cal_n/3);
			} else {
				System.out.print("*");
			}
		}
	}
	
	public boolean calculPossible(int num) {
		boolean check3 = false;

		for(int checkNum=1; checkNum<9; checkNum++) {
			if(Double.parseDouble(num+"") == Math.pow(3,checkNum)) {
				check3 = true;
			}
		}

		if(!check3) {
			System.out.println("3?˜ ? œê³±ê·¼?´ ?•„?‹˜");
		}

		return check3;
	}
}
