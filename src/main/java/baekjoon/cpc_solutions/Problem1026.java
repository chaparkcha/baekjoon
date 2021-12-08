package baekjoon.cpc_solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
// 클래스
public class Problem1026 {
    public Number solution() {
        // 5
        // 1 1 1 6 0
        // 2 7 8 3 1
        // A. 18

        // 3
        // 1 1 3
        // 10 30 20
        // A.80

        // 9
        // 5 15 100 31 39 0 0 3 26
        // 11 12 13 2 3 4 5 9 1
        // A.528
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ArrayA = new int[N];
        int[] ArrayB = new int[N];
        for (int i = 0; i < N; i++) {
            ArrayA[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            ArrayB[i] = sc.nextInt();
 
        }
        int answer = 0;
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];
        for(int i=0; i < N; i++) {
            A[i] = ArrayA[i];
            B[i] = ArrayB[i];
        }
        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());
        for(int i=0; i < N; i++) {
            answer = answer + A[i]*B[i];
        }
        
        sc.close();
        return answer;
    }
}