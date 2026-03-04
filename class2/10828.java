import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if (cmd.equals("push")){
                stack.offerLast(Integer.parseInt(st.nextToken()));
            }
            else if (cmd.equals("pop")){
                if (stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.pollLast());
            }
            else if (cmd.equals("size")){
                System.out.println(stack.size());
            }
            else if (cmd.equals("empty")){
                if (stack.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            else{
                if (stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.peekLast());
            }
        }
    }
}