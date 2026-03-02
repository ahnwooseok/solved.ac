import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 1;
        int range = 1;
        while (N > range){
            range += answer++ * 6;
        }
        System.out.println(answer);
    }
}