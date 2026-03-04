import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] array = new int[N][2];
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i] = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        }
        for (int i = 0; i < N; i++){
            int rank = 1;
            for (int j = 0; j < N; j++){
                if (i == j) continue;
                if (array[i][0] < array[j][0] && array[i][1] < array[j][1]) rank++;
            }
            System.out.print(rank + " ");
        }
    }
}