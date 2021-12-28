package baekjoon.cpc_solutions.brute_force;

import java.util.Arrays;
import java.util.Scanner;

public class Problem7568 {
    public void solution() {
        System.out.println("덩치");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //  사람 수
        int[] X = new int[N];
        int[] Y = new int[N];
        for(int i=0; i<N; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        sc.close();
        int[] result = new int[N];
        Arrays.fill(result, N);
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                if(X[i] > X[j] && Y[i] > Y[j]) {
                    result[i] -= 1;
                } else if (X[i] < X[j] && Y[i] < Y[j]){
                    result[j] -= 1;
                } else {
                    result[i] -= 1;
                    result[j] -= 1;
                }
            }
        }
        for(int i=0; i<N; i++) {
            System.out.print(result[i]);System.out.print(' ');
        }
    }
}
