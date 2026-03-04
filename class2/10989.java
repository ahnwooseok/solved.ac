import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[10001];
        for (int i = 0; i < N; i++){
            array[Integer.parseInt(br.readLine())] += 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10001; i++){
            if (array[i] != 0){
                for (int j = 0; j < array[i]; j++) sb.append(i).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}