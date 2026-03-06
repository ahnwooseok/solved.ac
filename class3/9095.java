import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            if (n <= 2) System.out.println(n);
            else if (n == 3) System.out.println(4);
            else{
                int[] dp = new int[n + 1];
                dp[1] = 1;
                dp[2] = 2;
                dp[3] = 4;
                for (int j = 4; j < n + 1; j++){
                    dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1];
                }
                System.out.println(dp[n]);
            }        
        }
    }
}