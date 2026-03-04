import java.io.*;
import java.util.*;

public class Main {
    private static boolean check (int num){
        if (num == 1) return false;
        else if (num == 2) return true;
        else{
            for (int i = 2; i <= Math.floor(Math.sqrt(num)); i++){
                if (num % i == 0) return false;
            }
            return true;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        for (int i = M; i <= N; i++){
            if (check(i)) System.out.println(i);
        }
    }
}