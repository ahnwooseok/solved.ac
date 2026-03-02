import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[9];
        for (int i = 0; i < 9; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        int max = Arrays.stream(array).max().getAsInt();
        for (int i = 0; i < 9; i++){
            if (array[i] == max){
                System.out.println(max);
                System.out.println(i + 1);
                break;
            }
        }
    }
}