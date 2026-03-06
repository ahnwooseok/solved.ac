import java.io.*;
import java.util.*;

public class Main {
    private static int[] parent;
    private static void union (int x, int y){
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY){
            parent[rootY] = rootX;
        }
    }
    private static int find (int x){
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) parent[i] = i;
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            union(x, y);
        }
        for (int i = 1; i <= N; i++){
            parent[i] = find(i);
        }
        int answer = 0;
        int target = parent[1];
        for (int i = 2; i <= N; i++){
            if (parent[i] == target) answer++;
        }
        System.out.println(answer);
    }
}