package baekjoon.ty_solutions.sort;

import java.util.*;

public class Problem10989 {

	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arrOrigin = new int[n];
		int[] count = new int[10000001];
		int[] result = new int[n];
		
		for(int i = 0; i < n; i++) {
			arrOrigin[i] = sc.nextInt();
		}
		sc.close();
		/** 참고사이트
		 * https://soobarkbar.tistory.com/101
		 * https://st-lab.tistory.com/104
		 */
		
		for(int i = 0; i < arrOrigin.length; i++) {
			count[arrOrigin[i]]++;			
		}
		
		for(int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}
		
		for(int i = arrOrigin.length - 1; i >= 0; i--) {
			int value = arrOrigin[i];
			count[value]--;
			result[count[value]] = value;
		}
		
		System.out.println("계수정렬(카운팅 정렬)");
		for (int val : result) {
			System.out.println(val);
		}
		
	}

}
