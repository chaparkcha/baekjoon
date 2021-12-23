package baekjoon.cpc_solutions.brute_force;

import java.util.Scanner;

public class Problem2231 {
    public void solution() {
        System.out.println("분해합");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 자연수 N(1 ≤ N ≤ 1,000,000)
        int length = (int)Math.log10(N)+1;
        sc.close();

        int count = 9*length;
        int minConstructor = N - count;
        boolean find = false;
        for(int i=0; i<count; i++) {
            int result = sum(minConstructor + i, length - 1, 0);
            if(minConstructor + i + result == N){
                System.out.println(minConstructor + i);
                find = true;
                break;
            }
        }
        if(!find) {
            System.out.println(0);
        }
    }

    public static int sum(int number, int length, int sum) {
        if(length == 0) {
            sum += number;
            return sum;
        } else {
            sum += number / Math.pow(10, length);
            number = (int)(number % Math.pow(10, length));
            length -= 1;
            return sum(number, length, sum);
        }
    }
}
