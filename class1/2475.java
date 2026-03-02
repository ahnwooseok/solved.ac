import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] splited = br.readLine().split(" ");
        int sum = 0;
        for (int i = 0; i < splited.length; i++) sum += Math.pow(Integer.parseInt(splited[i]), 2);
        System.out.println(sum % 10);
    }
}