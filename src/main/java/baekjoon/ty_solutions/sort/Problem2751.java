package baekjoon.ty_solutions.sort;

import java.util.*;

public class Problem2751 {
	static int[] arr2 = null;
	static int[] mergeArr = null;

	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrOrigin = new int[n];
		for (int i = 0; i < n; i++) {
			arrOrigin[i] = sc.nextInt();
		}
		sc.close();

		// 병합정렬
		arr2 = arrOrigin.clone();
		mergeArr = new int [arr2.length];
		mergeSort(0, arr2.length - 1);

		System.out.println("병합정렬");
		for (int val : arr2) {
			System.out.println(val);
		}

	}
	/** 참고사이트
	 * https://blog.naver.com/bakarim0309/222179740721
	 * https://blog.naver.com/ddolddol9905/222450019989 
	 */

	public static void mergeSort(int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			
			mergeSort(start, mid);
			mergeSort(mid + 1, end);

			int valStart = start;
			int valMidStart = mid+1;
			int valIndex = start;
			
			while(valStart <= mid && valMidStart <= end) {
				if(arr2[valStart] <= arr2[valMidStart]) {
					mergeArr[valIndex] = arr2[valStart];
					valIndex++;
					valStart++;
				} else {
					mergeArr[valIndex] = arr2[valMidStart];
					valIndex++;
					valMidStart++;
				}
			}

			if(valStart > valMidStart) {
				while(valMidStart <= end) {
					mergeArr[valIndex] = arr2[valMidStart];
					valIndex++;
					valMidStart++;
				}
			} else {
				while(valStart <= mid) {
					mergeArr[valIndex] = arr2[valStart];
					valIndex++;
					valStart++;
				}
			}
			
			for(int i = start; i <= end; i++) {
				arr2[i] = mergeArr[i];
			}
		}

	}

}
