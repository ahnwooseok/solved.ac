import java.io.*;
import java.util.*;

public class Main {

    private static void dfs (ArrayList<Integer>[] graph, int node, boolean[] visited){
        if (!visited[node]){
            visited[node] = true;
            System.out.print(node + " ");
        }
        for (int neighbor : graph[node]){
            if (visited[neighbor]) continue;
            dfs(graph, neighbor, visited);
        }
    }
    private static void bfs (ArrayList<Integer>[] graph, int start, boolean[] visited){
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(start);
        visited[start] = true;
        System.out.print(start + " ");
        while (!queue.isEmpty()){
            int node = queue.pollFirst();
            for (int neighbor : graph[node]){
                if (visited[neighbor]) continue;
                visited[neighbor] = true;
                queue.offerLast(neighbor);
                System.out.print(neighbor + " ");
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i < N + 1; i++) graph[i] = new ArrayList<>();
        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            graph[I].add(J);
            graph[J].add(I);
        }
        for (int i = 1; i < N + 1; i++) Collections.sort(graph[i]);
        boolean[] visited = new boolean[N + 1];
        dfs(graph, V, visited);
        System.out.println();
        visited = new boolean[N + 1];
        bfs(graph, V, visited);
    }
}