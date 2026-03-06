import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) array[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(array);
        int answer = 0;
        int acc = 0;
        for (int i = 0; i < N; i++){
            acc += array[i];
            answer += acc;
        }
        System.out.println(answer);
    }
}