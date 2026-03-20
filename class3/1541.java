import java.io.*;
import java.util.*;

public class Main {
    private static int tokenizer (String str){
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '+'){
                sum += Integer.parseInt(sb.toString());
                sb = new StringBuilder();
            }
            else sb.append(String.valueOf(str.charAt(i)));
        }
        sum += Integer.parseInt(sb.toString());
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split("-");
        int sum = 0;
        sum += tokenizer(strs[0]);
        for (int i = 1; i < strs.length; i++){
            sum -= tokenizer(strs[i]);
        }
        System.out.println(sum);
    }
}
