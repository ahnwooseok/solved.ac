import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> answer = new ArrayList<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) queue.offerLast(Integer.parseInt(br.readLine()));

        int num = 1;
        while (!queue.isEmpty()){
            int top = queue.peekFirst();
            if (stack.isEmpty()){
                stack.offerLast(num);
                answer.add("+");
                num++;
            }
            while (stack.peekLast() != top){
                stack.offerLast(num);
                answer.add("+");
                num++;
                if (num > n + 1){
                    System.out.println("NO");
                    return;
                }
            }
            stack.pollLast();
            queue.pollFirst();
            answer.add("-");
        }

        for (int i = 0; i < answer.size(); i++) System.out.println(answer.get(i));
    }
}