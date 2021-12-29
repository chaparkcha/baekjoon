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

	public static void mergeSort(int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(start, mid);
			mergeSort(mid + 1, end);

			int valStrat = start;
			int valMid = mid + 1;
			int valIndex = start;
			int tempVal = 0;
			while (valStrat <= mid || valMid <= end) {
				if (valMid > end || (valStrat <= mid && arr2[valStrat] < arr2[valMid])) {
					mergeArr[valIndex++] = arr2[valStrat++];
				} else {
					mergeArr[valIndex++] = arr2[valStrat++];
				}
			}

			for (int val : arr2) {
				System.out.print(val + " ");
			}
			System.out.println();
		}

	}

}
