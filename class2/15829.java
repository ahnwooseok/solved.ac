import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long sum = 0;
        long pow = 1;
        for (int i = 0; i < N; i++){
            int alpha = (int) str.charAt(i) - 96;
            sum = (sum + alpha * pow) % 1234567891;
            pow = (pow * 31) % 1234567891;
        }
        System.out.println(sum);
    }
}