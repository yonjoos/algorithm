import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {



    static int[][] board = {};
    static int answer = 0;
    static int[][] flag = {};
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
//        System.out.println("\n\nrow : " + row + " col : " + col);
        if(row == N) {
            answer++;
//            printBoard();
            return;
        }
        if(col == N){
            return;
        }
        if(OK(row, col)){
//            System.out.println("ok");
            point[row] = col;
            nQueen(row + 1, 0);

            for(int i = row; i < N; i++) point[i] = -1;
            nQueen(row, col + 1);
        }else{
            if(col == N){
//                System.out.println("끝");
                return;
            }else{
                nQueen(row, col + 1);
            }

        }
    }

    public static boolean OK(int row, int col){

        if(point[row] != -1) {
//            System.out.println("false");

            return false;
        }
        for(int ro = 0; ro < row; ro++){
            int c = point[ro];
//            System.out.println("c " + c + " r " + ro);

            if(c == col) {
//                System.out.println("1c " + c);
                return false;
            }
            if(ro + c == row + col) {
//                System.out.println("2c " + c);
                return false;
            }
            if(ro - c == row - col) {
//                System.out.println("3c " + c);
                return false;
            }
        }

//        System.out.println("true");
        return true;
    }

    public static void printBoard(){
        for(int i = 0; i < N; i++){
            int c = point[i];
            for(int j = 0; j < N; j++){
                if(c == j) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}