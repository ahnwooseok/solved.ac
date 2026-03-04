import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N % 5 == 0){
            System.out.println(N / 5);
            return;
        }
        int five = N / 5;
        while (true){
            if ((N - five * 5) % 3 == 0){
                System.out.println(five + (N - five * 5) / 3);
                return;
            }
            else{
                five--;
            }

            if (five < 0) break;
        }
        System.out.println(-1);
    }
}