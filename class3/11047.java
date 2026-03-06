import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) array[N - i - 1] = Integer.parseInt(br.readLine());

        int answer = 0;
        int idx = 0;
        while (K > 0){
            while (K >= array[idx]){
                K -= array[idx];
                answer++;
            }
            idx++;
        }

        System.out.println(answer);
    }
}