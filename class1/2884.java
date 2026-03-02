import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if (M >= 45) System.out.println(H + " " + (M - 45));
        else{
            H = (H + 24 - 1) % 24;
            M = (M + 60 - 45) % 60;
            System.out.println(H + " " + M);
        }
    }
}