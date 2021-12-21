package baekjoon.cpc_solutions.recursion;

import java.util.Scanner;

public class Problem10870 {
    public int solution() {
        System.out.println("피보나치 수 5");
        // Fn = Fn-1 + Fn-2
        int current = 1;
        int before = 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        sc.close();
        if(index == 0) {
            result = 0;
        } else if (index == 1) {
            result = 1;
        } else {
            return pabonachi5(index, current, before, result);
        }
        return result;
    }
    public static int pabonachi5(int index, int before, int current, int result) {
        if(index == 0) {
            return result;
        } else {
            index = index - 1;
            result = before + current;
            before = current;
            current = result;
            return pabonachi5(index, before, current, result);
        }
    }
}