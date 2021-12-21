package baekjoon.cpc_solutions.recursion;

import java.util.Scanner;

public class Problem10872 {
    public int solution() {
        System.out.println("팩토리얼 구하기");
        int result = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int i=n; i>0; i--) {
        //     result = result * i;
        // }
        sc.close();
        result = factorial(n, result);
        return result;
    }
    public int factorial(int n, int result) {
        if(n==0) {
            return result;
        } else {
            return factorial(n-1, n * result);
        }
    }
}
