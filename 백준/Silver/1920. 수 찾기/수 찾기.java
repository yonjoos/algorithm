import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {


    public static boolean binarySearch(List<Integer> list, int val){
        int head = 0;
        int tail = list.size()-1;
        int mid = (head + tail) / 2;

        while(head <= tail){
            mid = mid = (head + tail) / 2;
            if(list.get(mid) == val){

                return true;
            }
            else if(list.get(mid) < val){
                head = mid + 1;
            }
            else if(list.get(mid) > val){
                tail = mid - 1 ;
            }
        }


        return false;
    }
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> As = new ArrayList<>();
        List<Integer> Ms = new ArrayList<>();
        for(int i = 0; i < N; i++){
            As.add(sc.nextInt());
        }
        int M = sc.nextInt();
        for(int i = 0; i < M; i++){
            Ms.add(sc.nextInt());
        }

        Collections.sort(As);

        Ms.stream().forEach(o->{
            if(binarySearch(As, o)){
                System.out.println(1);
            }
            else System.out.println(0);
        });

    }

}