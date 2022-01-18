package baekjoon.cpc_solutions.brute_force;

import java.util.Scanner;

public class Problem1436 {
    public void solution() {
        System.out.println("영화감독 숌");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int stack = 0;
        boolean loop = true;
        int number = 0;
        while(loop) {
            number += 1;
            if(check(number)){
                stack += 1;
            }
            if(stack == N) {
                loop = false;
            }
        }
        System.out.println(stack);
        System.out.println(number);
    }

    public static boolean check(int number) {
        return Integer.toString(number).contains("666");
    }
}
