import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int n = 0;
        int answer = 1;
        while (true){
            if (String.valueOf(answer).contains("666")){
                n++;
                if (n == N) break;
                else answer++; 
            }
            else{
                answer++;
            }
        }
        System.out.println(answer);
    }
}