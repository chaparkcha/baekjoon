package baekjoon.cpc_solutions.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2447 {
    private static char [][] result;
    public void solution() {
        System.out.println("별찍기 10");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0, y=0;
        result = new char [n][n];
        sc.close();
		for(int i=0; i<n; i++) {
			Arrays.fill(result[i], ' ');
		}
        star10(n, x, y);
        for(int i=0; i<n; i++) {
			System.out.println(result[i]);
		}

    }
    public void star10(int n, int x, int y) {
        int next = n/3;
        if(n == 1) {
            result[x][y] = '*';
            return;
        } else {
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    if(i != 1 || j != 1)
                    star10(next, x+next*i, y+next*j);
                }
            }
        }
    }
}
