import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++){
            for (int j = i + 1; j < N; j++){
                for (int k = j + 1; k < N; k++){
                    int sum = (array[i] + array[j] + array[k]);
                    if (sum > M) continue;
                    answer = Math.min(answer, M - sum);
                }
            }
        }
        System.out.println(answer);
    }
}