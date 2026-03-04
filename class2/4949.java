import java.io.*;
import java.util.*;

public class Main {
    private static String balence (String str){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '(') stack.offerLast('(');
            if (str.charAt(i) == '[') stack.offerLast('[');
            if (str.charAt(i) == ')'){
                if (!stack.isEmpty() && stack.peekLast() == '(') stack.pollLast();
                else return "no";
            }
            if (str.charAt(i) == ']'){
                if (!stack.isEmpty() && stack.peekLast() == '[') stack.pollLast();
                else return "no";
            }
        }
        return stack.size() == 0 ? "yes" : "no";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = br.readLine()).equals(".")){
            System.out.println(balence(input));
        }
    }
}