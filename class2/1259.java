import java.io.*;
import java.util.*;

public class Main {
    private static boolean check (String n){
        StringBuilder sb = new StringBuilder();
        for (int i = n.length() - 1; i >= 0; i--) sb.append(String.valueOf(n.charAt(i)));
        String reversed = sb.toString();
        return n.equals(reversed);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = br.readLine()).equals("0")){
            if (check(input)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}