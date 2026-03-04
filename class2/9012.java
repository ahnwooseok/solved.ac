import java.io.*;
import java.util.*;

public class Main {
    private static String balence (String str){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '(') stack.offerLast('(');
            if (str.charAt(i) == ')'){
                if (!stack.isEmpty() && stack.peekLast() == '(') stack.pollLast();
                else return "NO";
            }
        }
        return stack.size() == 0 ? "YES" : "NO";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++){
            System.out.println(balence(br.readLine()));
        }
    }
}