import java.io.*;
import java.util.*;

public class Main {
    private static int gcd (int a, int b){
        int n = Math.min(a, b);
        for (int i = n; i > 0; i--){
            if (a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }
    private static int lcm (int a, int b){
        return a * b / gcd(a, b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.println(gcd(A, B));
        System.out.println(lcm(A, B));
    }
}