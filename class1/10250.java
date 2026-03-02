import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            
            int floor = N % H == 0 ? H : N % H;
            int room = (int) Math.ceil((double) N / H);
            
            if (room < 10) System.out.println(String.valueOf(floor) + "0" + String.valueOf(room));
            else System.out.println(String.valueOf(floor) + String.valueOf(room));
        }
    }
}