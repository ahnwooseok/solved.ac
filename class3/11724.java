import java.io.*;
import java.util.*;

public class Main {
    private static int[] parent;
    private static int find (int x){
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
    private static void union (int x, int y){
        int parentX = find(x);
        int parentY = find(y);
        if (parentX != parentY) parent[parentY] = parentX;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        parent = new int[N + 1];
        for (int i = 1; i < N + 1; i++) parent[i] = i;
        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            union(u, v);
        }
        for (int i = 1; i < N + 1; i++) parent[i] = find(i);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i < N + 1; i++) set.add(parent[i]);
        System.out.println(set.size());

    }
}