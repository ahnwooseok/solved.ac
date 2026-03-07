import java.io.*;
import java.util.*;

public class Main {
    private static int N;
    private static int max;
    private static int[] array;
    private static void dfs (int prev, int idx, int sum){
        if (idx >= N) return;
        else if (idx == N - 1){
            sum += array[idx];
            max = Math.max(max, sum);
            return;
        }
        else if (idx == -1){
            dfs(1, 0, array[0]);
            dfs(1, 1, array[1]);
            dfs(1, 2, array[2]);
        }
        else{
            if (prev == 2){
                dfs(1, idx + 2, sum + array[idx]);
            }
            else{
                dfs(2, idx + 1, sum + array[idx]);
                dfs(1, idx + 2, sum + array[idx]);
            }
        }        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        max = 0;
        array = new int[N];
        for (int i = 0; i < N; i++) array[i] = Integer.parseInt(br.readLine());
        dfs(1, -1, 0);
        System.out.println(max);
    }
}