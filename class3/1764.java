import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) set.add(br.readLine());
        for (int i = 0; i < M; i++){
            String input = br.readLine();
            if (set.contains(input)) list.add(input);
        }

        Collections.sort(list);
        int size = list.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) System.out.println(list.get(i));
    }
}