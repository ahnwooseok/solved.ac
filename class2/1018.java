import java.io.*;
import java.util.*;

public class Main {
    private static int diff (String[][] board, String[][] board2){
        int count = 0;
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (!board[i][j].equals(board2[i][j])) count++;
            }
        }
        return count;
    }
    private static int count (String[][] board){
        String[][] map = new String[8][8];
        String[][] map2 = new String[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if ((i + j) % 2 == 0){
                    map[i][j] = "W";
                    map2[i][j] = "B";
                }
                else{
                    map[i][j] = "B";
                    map2[i][j] = "W";
                }
            }
        }
        return Math.min(diff(board, map), diff(board, map2));
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] board = new String[N][M];
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) board[i] = br.readLine().split("");
        for (int i = 0; i < N - 7; i++){
            for (int j = 0; j < M - 7; j++){
                String[][] sliced = new String[8][8];
                for (int k = 0; k < 8; k++){
                    sliced[k] = Arrays.copyOfRange(board[i + k], j, j + 8);
                }
                answer = Math.min(answer, count(sliced));
            }
        }
        System.out.println(answer);
    }
}