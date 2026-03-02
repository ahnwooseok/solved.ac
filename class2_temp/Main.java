

    import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            String str = br.readLine();
            long sum = 0;
            for (int i = 0; i < N; i++){
                int h = Integer.parseInt(String.valueOf(str.charAt(i) - 96));
                sum += (h * Math.pow(31, h - 1));
            }
            System.out.println(sum % 1234567891);
        }
    }
