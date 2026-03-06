import java.io.*;
import java.util.*;

public class Main {
    private static final int[] ry = {0, 0, 1, -1};
    private static final int[] rx = {1, -1, 0, 0};
    private static class Node{
        int y, x, dist;
        public Node (int y, int x, int dist){
            this.y = y;
            this.x = x;
            this.dist = dist;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        int[][] answer = new int[N][M];

        ArrayDeque<Node> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++){
                int value = Integer.parseInt(st.nextToken());
                if (value == 2){
                    queue.offerLast(new Node(i, j, 0));
                    answer[i][j] = 0;
                }
                else if (value == 1) answer[i][j] = -1;
                map[i][j] = value;
            }
        }
        
        while (!queue.isEmpty()){
            Node now = queue.pollFirst();
            
            for (int i = 0; i < 4; i++){
                int dy = ry[i] + now.y;
                int dx = rx[i] + now.x;
                if (dy >= N || dy < 0 || dx >= M || dx < 0 || map[dy][dx] == 0 || answer[dy][dx] != -1) continue;
                queue.offerLast(new Node(dy, dx, now.dist + 1));
                answer[dy][dx] = now.dist + 1;
            }
        }

        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++) System.out.print(answer[i][j] + " ");
            System.out.println();
        }

    }
}