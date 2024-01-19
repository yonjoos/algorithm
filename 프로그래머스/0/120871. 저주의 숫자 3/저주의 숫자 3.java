import java.util.*;

class Solution {
    public int solution(int n) {        
        int[] result = new int[n+1];
        
        result = initialize(n);
        
        for(int i = 0; i < result.length; i++){
        }
        return result[n];
        
    }
    
    private int[] initialize(int n){
        int[] res = new int[n+1];
        int number = 1;
        
        for(int index = 1; index < n + 1; index++){
            while(check(number)){
                number++;
            }

            res[index] = number++;
            
        }
        
        return res;
    }
    
    private boolean check(int number){
        System.out.println("checking " + number);
        if(number % 3 == 0) {
            return true;
        }
        
        String str = String.valueOf(number);
        if(str.contains("3")) {
            return true;
        }
        
        return false;
    }
    
}