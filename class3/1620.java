import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        for (int i = 1; i <= M; i++){
            String input = br.readLine();
            map.put(input, i);
            map2.put(i, input);
        }
        for (int i = 0; i < N; i++){
            String input = br.readLine();
            if (map.containsKey(input)) System.out.println(map.get(input));
            else System.out.println(map2.get(Integer.parseInt(input)));
        }
    }
}