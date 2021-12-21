package baekjoon.cpc_solutions.brute_force;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2798 {
    public void solution() {
        System.out.println("블랙잭");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //  카드의 개수 N(3 ≤ N ≤ 100)
        int M = sc.nextInt(); // 3수의 합 (10 ≤ M ≤ 300,000)
        int[] numberList = new int[N];
        int result = 0, temp = 0;
        for(int i=0; i<N; i++) {
            numberList[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(numberList);
        
        Loop1 :
        for(int i=0; i<numberList.length; i++){
            for(int j=i+1; j<numberList.length; j++){
                for(int k=j+1; k<numberList.length; k++) {
                    result = numberList[i] + numberList[j] + numberList[k];
                    if(result > M) {
                        continue;
                    }
                    if(temp < result) {
                        temp = result;
                    }
                    if(result == M) {
                        break Loop1;
                    }
                }
            }
        }
        System.out.println(temp);
    }
}
