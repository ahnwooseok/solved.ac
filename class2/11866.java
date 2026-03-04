import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) queue.offerLast(i);
        while (!queue.isEmpty()){
            for (int i = 0; i < K - 1; i++) queue.offerLast(queue.pollFirst());
            list.add(queue.pollFirst());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < list.size(); i++){
            if (i == list.size() - 1) sb.append(list.get(i) + "> ");
            else sb.append(list.get(i) + ", ");
        }
        System.out.println(sb.toString());
    }
}