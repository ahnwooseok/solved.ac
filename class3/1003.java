import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                System.out.println(1 + " " + 0);
                continue;
            }
            int[][] dp = new int[x + 1][2];
            dp[0] = new int[]{1, 0};
            dp[1] = new int[]{0, 1};
            for (int j = 2; j <= x; j++){
                dp[j][0] = dp[j - 1][0] + dp[j - 2][0];
                dp[j][1] = dp[j - 1][1] + dp[j - 2][1];
            }
            System.out.println(dp[x][0] + " " + dp[x][1]);
        }
    }
}