import java.io.*;
import java.util.*;

public class Main {
    private static int[] find (int n){
        int[] twofive = new int[2];
        while (n % 2 == 0){
            twofive[0] += 1;
            n /= 2;
        }
        while (n % 5 == 0){
            twofive[1] += 1;
            n /= 5;
        }
        return twofive;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int two = 0;
        int five = 0;
        for (int i = 1; i <= N; i++){
            int[] twofive = find(i);
            two += twofive[0];
            five += twofive[1];
        }
        System.out.println(Math.min(two, five));
    }
}