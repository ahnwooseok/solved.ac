import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++){
            HashMap<String, Integer> map = new HashMap<>();
            int N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String cloth = st.nextToken();
                map.put(cloth, map.getOrDefault(cloth, 0) + 1);
            }
            int answer = 1;
            for (HashMap.Entry<String, Integer> entry : map.entrySet()){
                answer *= entry.getValue() + 1;
            }
            System.out.println(answer - 1);
        }
    }
}