import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String str = String.valueOf(A * B * C);
        int[] array = new int[10];
        for (int i = 0; i < str.length(); i++){
            array[Integer.parseInt(String.valueOf(str.charAt(i)))] += 1;
        }
        for (int i = 0; i < 10; i++) System.out.println(array[i]);
    }
}