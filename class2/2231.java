import java.io.*;
import java.util.*;

public class Main {
    private static int divideSum (int num){
        int sum = num;
        while (num > 0){
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 1; i < N; i++){
            if (divideSum(i) == N){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}