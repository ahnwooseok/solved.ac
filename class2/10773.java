import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            if (num != 0) stack.offerLast(num);
            else stack.pollLast();
        }
        System.out.println(stack.stream().mapToInt(Integer::intValue).sum());
    }
}