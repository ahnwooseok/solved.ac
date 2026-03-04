import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());

            ArrayDeque<int[]> queue = new ArrayDeque<>();
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < N; j++){
                int score = Integer.parseInt(st.nextToken());
                list.add(score);
                queue.offerLast(new int[]{j, score});
            }

            
            Collections.sort(list, Comparator.reverseOrder());
            int idx = 0;
            int count = 1;

            while (true){
                if (queue.peekFirst()[1] == list.get(idx)){
                    int[] pop = queue.pollFirst();
                    idx++;
                    if (pop[0] == M){
                        System.out.println(count);
                        break;
                    }
                    else count++;
                }
                else{
                    queue.offerLast(queue.pollFirst());
                }
            }
        }
    }
}