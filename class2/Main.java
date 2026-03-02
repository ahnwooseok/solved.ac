import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++){
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        int sum = Arrays.stream(array).sum();
        int[] mid = array.clone();
        Arrays.sort(mid);
        System.out.println(sum / N);
        System.out.println(mid[N / 2]);
        System.out.println(map.entrySet().stream().sorted(Map.Entry.comparingByValue()).limit(2).forEach(x -> System.out.println(x)));
        System.out.println(Arrays.stream(array).max().getAsInt() - Arrays.stream(array).min().getAsInt());
    }
}