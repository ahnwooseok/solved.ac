import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = N; i >= 1; i--) queue.offerLast(i);
        while (queue.size() != 1){
            queue.pollLast();
            queue.offerFirst(queue.pollLast());
        }
        System.out.println(queue.peekLast());
    }
}