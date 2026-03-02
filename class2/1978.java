import java.io.*;
import java.util.*;

public class Main {
    private static boolean check (int num){
        if (num == 1) return false;
        else if (num == 2) return true;
        else{
            for (int i = 2; i < num; i++){
                if (num % i == 0) return false;
            }
            return true;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        for (int i = 0; i < N; i++){
            if (check(Integer.parseInt(st.nextToken()))) answer++;
        }
        System.out.println(answer);
    }
}