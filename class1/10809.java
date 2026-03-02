import java.io.*;
import java.util.*;
public class Main {
    private static int sum (int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) sum += i;
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String[] array ={"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) sb.append(S.indexOf(array[i]) + " ");
        System.out.println(sb.toString());
    }
}