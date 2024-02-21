import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int[][] graph = {};
    static int ans = 0;
    static HashSet<Integer> a = new HashSet<>();
    static boolean[] visited = {};

    public static void main(String[] args) throws Exception{


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//


        Scanner sc = new Scanner(System.in);
        int computers = sc.nextInt();
        int netLines = sc.nextInt();


        graph = new int[computers ][computers ];
        visited = new boolean[computers];

        for(int i = 0; i < netLines; i++){
            int p = sc.nextInt();
            int c = sc.nextInt();

            if(p > c){
                int tmp = p;
                p = c;
                c = tmp;
            }
            graph[p-1][c-1] = 1;
            graph[c-1][p-1] = 1;
        }

//        System.out.println();
//        for(int[] k : graph){
//            for(int j : k){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }



        find(0);

//        System.out.println();
//        for(int[] k : graph){
//            for(int j : k){
//                if(j == -1) System.out.print("X ");
//                else if(j == 0) System.out.print("O ");
//                else System.out.print("+ ");
//            }
//            System.out.println();
//        }



        System.out.println(ans);

    }

//    public static void swap(int a, int b){
//        if(a > b){
//            int t = a;
//            a = b;
//            b = t;
//        }
//    }
    public static int find(int curr){
        visited[curr] = true;

        for(int point = 0; point < graph.length; point++){
            if(visited[point] == false && hasConn(curr, point)){


                ans++;
//                swap(curr, point);

//                System.out.println();
//                for(int[] k : graph){
//                    for(int j : k){
//
//                        if(j > 0)System.out.print( " O ");
//                        else System.out.print(" X ");
//                    }
//                    System.out.println();
//                }
                find(point);
            }
        }

        return -1;
    }

    public static boolean hasConn(int a, int b){
        if (graph[a][b] > 0) return true;
        if( graph[b][a] > 0) return true;

        return false;
    }






}