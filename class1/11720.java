import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        String str = br.readLine();
        for (int i = 0; i < N; i++) sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        System.out.println(sum);
    }
}