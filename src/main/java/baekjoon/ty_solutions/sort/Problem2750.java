package baekjoon.ty_solutions.sort;

import java.util.*;

public class Problem2750 {

	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arrOrigin = new int[n];
		
		for(int i = 0; i < n; i++) {
			arrOrigin[i] = sc.nextInt();
		}
		sc.close();
		
		//자바에서 제공하는 정렬
		int[] arr = arrOrigin.clone();
		Arrays.sort(arr);
		System.out.println("자바 제공 정렬");
		for(int val : arr) {
			System.out.println(val);
		}
		
 
		//버블정렬
		int[] arr2 = arrOrigin.clone();
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr2[i] > arr2[j]) {
					int temp = arr2[j];
					arr2[j] = arr2[i];
					arr2[i] = temp;
				}
			}
		}
		System.out.println("버블정렬");
		for(int val : arr2) {
			System.out.println(val);
		}
		
		//삽입정렬
		int[] arr3 = arrOrigin.clone();
		int insertNum = 0;
		for (int i=1; i < n; i++) {
			insertNum = arr3[i];
	        int j = i-1;
	        while (j>=0 && arr3[j]>insertNum) {
	        	arr3[j + 1] = arr3[j];
	            j--;
	        }
	        arr3[j+1] = insertNum;
	    }
		System.out.println("삽입정렬");
		for(int val : arr3) {
			System.out.println(val);
		}
		
		//선택정렬
		int[] arr4 = arrOrigin.clone();
		int minIndex = 0;
		for(int i = 0; i < n-1; i++) {
			minIndex = i;	
			for(int j = i + 1; j < n; j++) {
				if(arr4[j] < arr4[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr4[minIndex];
			arr4[minIndex] = arr4[i];
			arr4[i] = temp;
		}
		System.out.println("선택정렬");
		for(int val : arr4) {
			System.out.println(val);
		}
		
	}

}
