import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {


    static int[][] map = {};
    static int[][] visited = {};
    static int[] dx = {1, 0, 0, -1}; //우하상좌
    static int[] dy = {0, 1, -1, 0};

    static int N = 0;
    static int M = 0;


    static Queue<Point> q = new LinkedList<>();

    static List<Point> ans = new ArrayList<>();

    public static void main(String[] args) throws Exception{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());



        map = new int[N][M];
        visited = new int[N][M];

        for(int i=0;i<N;i++) {
            char[]  cArr=br.readLine().toCharArray();
            for(int j=0;j<M;j++) {
                map[i][j] = cArr[j] -'0';
            }
        }


        Point start = new Point(0,0,0);
        visited[0][0] = 1;
        q.offer(start);

        while(q.size() != 0){
            Point p = q.poll();

            if(p.x == M - 1 && p.y == N - 1){
                System.out.println(p.dist + 1);
                break;
            }

            addChildren(p, q);

//            System.out.println();
//            for(int i = 0; i < N; i++){
//                for(int j = 0; j < M; j++){
//                    System.out.print(visited[i][j] + " ");
//                }
//                System.out.println();
//            }
        }


    }




    public static void addChildren(Point p,  Queue<Point> queue){

        for(int i = 0; i < 4; i++){
            int nx = p.x + dx[i];
            int ny = p.y + dy[i];


            if( nx > -1 && ny > -1 && nx < M && ny < N) {
                if (visited[ny][nx] != 1 && map[ny][nx] == 1) {
                    visited[ny][nx] = 1; //enqueue 할 좌표도 visited 체크를 했어야 했음
                    queue.offer(new Point(nx, ny, p.dist + 1));
                }
            }
        }
    }

    public static class Point {
        int x = -1;
        int y = -1;

        int dist = 0;

        Point(int x, int y, int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }




    }
}