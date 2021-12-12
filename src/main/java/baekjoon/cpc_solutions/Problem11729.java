package baekjoon.cpc_solutions;

import java.util.Scanner;

public class Problem11729 {
    public void solution() {
        System.out.println("하노이 탑 이동 순서");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int max = (int) Math.pow(2, n) - 1;
        System.out.println(max);
        hanoi(n, 1, 2, 3);

    }
    public void hanoi(int count, int from, int by, int to) {
        if(count == 1) {
            System.out.printf("%d %d\n", from, to);    
        } else {
            hanoi(count-1, from, to, by);
            System.out.printf("%d %d\n", from, to); 
            hanoi(count-1, by, from, to);
        }
    }
}
