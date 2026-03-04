import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            array[i] = num;
            list.add(num);
            map.put(num, map.getOrDefault(num ,0) + 1);
        }
        Collections.sort(list);

        ArrayList<int[]> list2 = new ArrayList<>();
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()){
            list2.add(new int[]{entry.getKey(), entry.getValue()});
        }
        Collections.sort(list2, (o1, o2) -> {
            if (o1[1] == o2[1]) return Integer.compare(o1[0], o2[0]);
            else return Integer.compare(o2[1], o1[1]);
        });

        System.out.println(Math.round((double) Arrays.stream(array).sum() / N));
        System.out.println(list.get(N / 2));
        if (N >= 2 && list2.get(0)[1] == list2.get(1)[1]){
            System.out.println(list2.get(1)[0]);
        }
        else System.out.println(list2.get(0)[0]);
        System.out.println(Arrays.stream(array).max().getAsInt() - Arrays.stream(array).min().getAsInt());
    }
}