import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int[] array = new int[]{A, B, C};
            Arrays.sort(array);
            if (A == 0 && B == 0 && C == 0) break;
            if (Math.pow(array[0], 2) + Math.pow(array[1], 2) == Math.pow(array[2], 2)) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}