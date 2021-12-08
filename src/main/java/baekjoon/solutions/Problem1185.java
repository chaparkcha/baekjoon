package baekjoon.solutions;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;
// 클래스
public class Problem1185 {
    public Number solution() {
        // 5 7
        // 10
        // 10
        // 20
        // 6
        // 30
        // 1 2 5
        // 2 3 5
        // 2 4 12
        // 3 4 17
        // 2 5 15
        // 3 5 6
        // 4 5 12
        // A.176
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정점의 개수 
        int p = sc.nextInt(); // 간선의 개수
        int [] G = new int [n];
        for(int i=0; i <= n; i++) {
            G[i] = sc.nextInt();
        }

        boolean visited[] = new boolean[n + 1]; // 방문 여부를 검사할 배열 

        LinkedList<Integer>[] adjList = new LinkedList[n + 1];

        for (int i = 0; i <= n; i++) {
            adjList[i] = new LinkedList<Integer>();
        }

        // 두 정점 사이에 여러 개의 간선이 있을 수 있다.
        // 입력으로 주어지는 간선은 양방향이다.
        for (int i = 0; i < p; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }

        for (int i = 1; i <= n; i++) { // 방문 순서를 위해 오름차순 정렬 
            Collections.sort(adjList[i]);
        }

        System.out.println("DFS - 인접리스트");
        for(int i = 0; i <= n; i++) {
            dfs_list(i, adjList, visited);
        }
        int answer = 0;
        
        sc.close();
        return answer;
        }

    // DFS - 인접리스트 - 재귀로 구현 
    public static void dfs_list(int v, LinkedList<Integer>[] adjList, boolean[] visited) {
        visited[v] = true; // 정점 방문 표시
        System.out.print(v + " "); // 정점 출력

        Iterator<Integer> iter = adjList[v].listIterator(); // 정점 인접리스트 순회
        while (iter.hasNext()) {
            int w = iter.next();
            if (!visited[w]) // 방문하지 않은 정점이라면 
                dfs_list(w, adjList, visited); // 다시 DFS
        }
    }
}