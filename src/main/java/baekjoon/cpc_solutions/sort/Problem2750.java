package baekjoon.cpc_solutions.sort;

import java.util.Scanner;

public class Problem2750 {
    public void solution() {
        System.out.println("수 정렬하기 1");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] numbers = new int [N];
        for(int i=0; i<N; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();
        // 버블정렬
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        // 선택정렬
        // for(int i=0; i<N; i++) {
        //     int select = i;
        //     int smallest = numbers[i];
        //     for(int j=i; j<N; j++) {
        //         if(smallest > numbers[j]) {
        //             select = j;
        //             smallest = numbers[j];
        //         }
        //     }
        //     int temp = numbers[select];
        //     numbers[select] = numbers[i];
        //     numbers[i] = temp;
        // }

        for(int i=0; i<N; i++) {
            System.out.println(numbers[i]);
        }
    }
}
