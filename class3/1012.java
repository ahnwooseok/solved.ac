import java.io.*;
import java.util.*;

public class Main {
    private static final int[] rx = {0, 0, 1, -1};
    private static final int[] ry = {1, -1, 0, 0};
    private static class Node{
        int x, y;
        public Node (int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    private static void bfs (int x, int y, boolean[][] map, int M, int N){
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.offerLast(new Node(x, y));
        map[x][y] = false;
        while (!queue.isEmpty()){
            Node now = queue.pollFirst();
            for (int i = 0; i < 4; i++){
                int dx = now.x + rx[i];
                int dy = now.y + ry[i];
                if (dx < 0 || dx >= M || dy < 0 || dy >= N || !map[dx][dy]) continue;
                map[dx][dy] = false;
                queue.offerLast(new Node(dx, dy));
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            boolean[][] map = new boolean[M][N];
            for (int j = 0; j < K; j++){
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                map[X][Y] = true;
            }
            int worms = 0;
            for (int j = 0; j < M; j++){
                for (int k = 0; k < N; k++){
                    if (map[j][k]){
                        bfs(j, k, map, M, N);
                        worms++;
                    }
                }
            }
            System.out.println(worms);
        }
    }
}
