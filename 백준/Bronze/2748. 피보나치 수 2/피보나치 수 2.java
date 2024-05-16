import java.util.*;


public class Main {

      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int start = 0;
        int second = 1;

        long[] arr = new long[n+1];
        Arrays.fill(arr, -1);
        arr[0] = start;
        arr[1] = second;

        sol(arr, n);

        System.out.println(arr[arr.length -1]);
    }
    
    public static long sol(long[] arr, int index){
        if(arr[index] != -1){
            return arr[index];
        }

        arr[index] = sol(arr, index-2) + sol(arr, index-1);
        return arr[index];
    }


}