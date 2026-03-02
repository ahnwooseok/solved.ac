    import java.io.*;
    import java.util.*;

    public class Main {
        private static String fizzbuzz (int n){
            if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz";
            else if (n % 3 == 0 && n % 5 != 0) return "Fizz";
            else if (n % 3 != 0 && n % 5 == 0) return "Buzz";
            else return String.valueOf(n);
        }
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] strs = new String[3];
            for (int i = 0; i < 3; i++){
                strs[i] = br.readLine();
            }
            int[] array = new int[3];
            for (int i = 0; i < 3; i++){
                if (!strs[i].equals("FizzBuzz") && !strs[i].equals("Fizz") && !strs[i].equals("Buzz")){
                    array[i] = Integer.parseInt(strs[i]);
                }
            }
            int next = 0;
            for (int i = 0; i < 3; i++){
                if (array[i] != 0){
                    next = array[i] + 3 - i;
                }
            }
            System.out.println(fizzbuzz(next));
        }
    }