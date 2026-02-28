    import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] array = new int[N];
            for (int i = 0; i < N; i++){
                array[i] = Integer.parseInt(st.nextToken());
            }
            int M = Arrays.stream(array).max().getAsInt();
            double sum = 0;
            for (int i = 0; i < N; i++){
                sum += (double) array[i] / M * 100;
            }
            System.out.println(sum / N);
        }
    }