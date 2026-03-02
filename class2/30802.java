import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[6];
        for (int i = 0; i < 6; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int[] answer = new int[3];
        for (int i = 0; i < 6; i++) answer[0] += (int) Math.ceil((double) array[i] / T);
        answer[1] = N / P;
        answer[2] = N % P;

        System.out.println(answer[0]);
        System.out.println(answer[1] + " " + answer[2]);
    }
}