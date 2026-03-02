import java.io.*;
import java.util.*;
public class Main {
    private static int sum (int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) sum += i;
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++){
            String S = br.readLine();
            ArrayList<Integer> list = new ArrayList<>();
            int cnt = 0;
            for (int i = 0; i < S.length(); i++){
                
                if (S.charAt(i) == 'O'){
                    cnt++;
                }
                else{
                    list.add(cnt);
                    cnt = 0;
                }

                if (i == S.length() - 1){
                    list.add(cnt);
                }
            }

            int sum = 0;
            for (int i = 0; i < list.size(); i++){
                sum += sum(list.get(i));
            }
            System.out.println(sum);
        }
    }
}