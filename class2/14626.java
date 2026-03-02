    import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            int sum = 0;
            boolean multi3 = false;
            for (int i = 0; i < 13; i++){
                String s = String.valueOf(str.charAt(i));
                if (s.equals("*")){
                    multi3 = i % 2 == 0 ? false : true;
                    continue;
                }
                if (i % 2 == 0){
                    sum += Integer.parseInt(s);
                }
                else{
                    sum += Integer.parseInt(s) * 3;
                }
            }
            for (int i = 0; i < 10; i++){
                if (!multi3){
                    if ((sum + i) % 10 == 0){
                        System.out.println(i);
                        break;
                    }
                }
                else{
                    if ((sum + 3 * i) % 10 == 0){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }