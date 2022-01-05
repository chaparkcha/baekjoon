package baekjoon.cpc_solutions.brute_force;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1018 {
    public void solution() {
        System.out.println("체스판 다시 칠하기");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //  세로
        int M = sc.nextInt(); //  가로
        String [][] board = new String [N][M];

        for(int i=0; i<N; i++) {
            board[i] = sc.next().split("(?!^)");
        }
        sc.close();
        int minimum = 99999999;
        int result = 0;
        for(int i=0; i<N-7; i++) {
            for(int j=0; j<M-7; j++) {
                // 8X8 크기로 잘릴 수 있도록 첫번째 인덱스를 찾아놓고
                // 해당 인덱스부터 8칸씩 체스판을 만들어본다.
                int temp1 = 0;
                int temp2 = 0;
                for(int a=i; a<i+8; a++) {
                    for(int b=j; b<j+8; b++) {
                        // 8x8 체스판을 검정색 우선 or 흰색 우선으로 칠하며 카운트 한다.
                        // System.out.print(board[a][b]);
                        temp1 += check(a, b, board[a][b], "B", i, j);
                        temp2 += check(a, b, board[a][b], "W", i, j);
                    }
                }
                result = temp1 < temp2 ? temp1 : temp2;
                if(result < minimum) {
                    minimum = result;
                }
            }
        }
        System.out.println(minimum);
    }
    public static int check(int x, int y, String backgroundColor, String startColor, int startX, int startY) {
        
        boolean toggle = (x + y)%2 != (startX + startY)%2;
        boolean result;
        if(toggle) {
            result = !backgroundColor.equals(startColor);
        } else {
            result = backgroundColor.equals(startColor);
        }
        return result ? 0 : 1;
    }
}
