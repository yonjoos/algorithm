import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {



    static int answer = 0;
    static int[] point = {};
    static int N = -1;

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        point = new int[N];
        Arrays.fill(point, -1);

        nQueen(0,0);
        System.out.println(answer);

    }

    public static void nQueen(int row, int col){
        if(row == N) {
            answer++;
//            printBoard();
            return;
        }
        else if(col == N){
            return;
        }

        if(OK(row, col)){
            point[row] = col;
            nQueen(row + 1, 0);

            for(int i = row; i < N; i++) point[i] = -1;
            nQueen(row, col + 1);

        }else{
            if(col == N) return;

            nQueen(row, col + 1);
        }
    }

    public static boolean OK(int row, int col){

        if(point[row] != -1) {
            return false;
        }
        for(int ro = 0; ro < row; ro++){
            int c = point[ro];

            if(c == col) {
                return false;
            }
            if(ro + c == row + col) {
                return false;
            }
            if(ro - c == row - col) {
                return false;
            }
        }
        return true;
    }

}