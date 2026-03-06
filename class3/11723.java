import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        boolean[] set = new boolean[21];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if (cmd.equals("add")){
                int x = Integer.parseInt(st.nextToken());
                if (!set[x]) set[x] = true;
            }
            else if (cmd.equals("remove")){
                int x = Integer.parseInt(st.nextToken());
                if (set[x]) set[x] = false;
            }
            else if (cmd.equals("check")){
                int x = Integer.parseInt(st.nextToken());
                if (set[x]) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            else if (cmd.equals("toggle")){
                int x = Integer.parseInt(st.nextToken());
                if (set[x]) set[x] = false;
                else set[x] = true;
            }
            else if (cmd.equals("all")){
                for (int j = 1; j <= 20; j++) set[j] = true;
            }
            else{
                for (int j = 1; j <= 20; j++) set[j] = false;
            }
        }
        System.out.println(sb.toString());
    }
}