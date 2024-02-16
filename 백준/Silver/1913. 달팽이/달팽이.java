import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};



    public static void main(String[] args) throws Exception{
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int target = sc.nextInt();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());


        // 시간초과 방지
        StringBuilder sb = new StringBuilder();

        int[][] tmp = new int[N][N];

        int value = 1;
        int x = N/2, y= N/2;
        int nx = x, ny = y;
        int d = 0;
        int ansX = -1, ansY = -1;

        while(true){

            if(value == target){
                ansX = y + 1;
                ansY = x + 1;
            }
            tmp[y][x] = value++;

            nx = x + dx[d];
            ny = y + dy[d];

            if(nx == -1 || ny == -1 || nx > N ||ny > N || tmp[ny][nx] != 0){
                d = (d + 3)%4;
                nx = x + dx[d];
                ny = y + dy[d];

                if(nx == -1 || ny == -1 || nx >= N  ||ny >= N  || tmp[ny][nx] != 0){
                    break;
                }
            }
            x = nx;
            y = ny;
            d = (d +1)%4;

        }

        for(int[] i : tmp){
            for(int j : i){
                sb.append(j + " ");
            }
            sb.append("\n");
        }

        sb.append(ansX + " " + ansY);

        System.out.println(sb);
        br.close();
    }

}