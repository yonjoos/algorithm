import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {


    private static boolean isDivided(int tar){
        int sqrt = (int)Math.sqrt(tar) + 1;
        for(int i = 2; i < sqrt; i++){
            if(tar % i == 0) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        if(N == 1) return;
        if(N <= 2) {
            System.out.println(2);
            return;
        }

        List<Integer> tmp = new ArrayList<>();

        for(int target = M ; target <= N; target++){
            if (target == 1) continue;
            if(!isDivided(target)){
                tmp.add(target);
            }
        }


        for(int i : tmp) System.out.println(i);

    }

}