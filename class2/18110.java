import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cut = (int) Math.round((double) n * 0.15);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = Integer.parseInt(br.readLine());
        Arrays.sort(array);
        int[] cutArray = Arrays.copyOfRange(array, cut, n - cut);
        int sum = Arrays.stream(cutArray).sum();
        System.out.println(Math.round((double) sum / cutArray.length));
    }
}