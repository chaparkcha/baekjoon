package baekjoon.ty_solutions.sort;

import java.util.*;

public class Problem2108 {

	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arrOrigin = new int[n];
		
		for(int i = 0; i < n; i++) {
			arrOrigin[i] = sc.nextInt();
		}
		sc.close();
		
		int sum = 0;
		int avg = 0;
		for(int a : arrOrigin) {
			sum += a;
		}
		avg = sum/arrOrigin.length;
		System.out.println("평균 : "+avg);
		
		int[] sortArr = arrOrigin.clone();
		Arrays.sort(sortArr);
		int mid = sortArr[arrOrigin.length/2];
		System.out.println("중간값 : "+mid);
		
		int[] modeArr = new int[sortArr[arrOrigin.length-1]+1];
		System.out.println(sortArr[arrOrigin.length-1]);
		int maxFreq = 0;
		for(int i=0; i<sortArr.length; i++) {
			System.out.println(sortArr[i]+" / "+modeArr[i]);
			//modeArr[sortArr[i]]++;
		}
		for (int i=0; i< sortArr.length; i++){
            if(maxFreq<sortArr[i]){
            	maxFreq = sortArr[i];
            }          
        }      
		System.out.println("최빈값 : "+maxFreq);
		
		
	}

}
