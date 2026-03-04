import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if (cmd.equals("push")){
                queue.offerLast(Integer.parseInt(st.nextToken()));
            }
            else if (cmd.equals("pop")){
                if (queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.pollFirst());
            }
            else if (cmd.equals("size")){
                System.out.println(queue.size());
            }
            else if (cmd.equals("empty")){
                if (queue.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            else if (cmd.equals("front")){
                if (queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.peekFirst());
            }
            else{
                if (queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.peekLast());
            }
        }
    }
}