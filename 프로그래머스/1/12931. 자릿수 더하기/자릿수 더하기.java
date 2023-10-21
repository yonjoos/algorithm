import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String number = Integer.toString(n);
        int size = number.length();
        
        
        for(int i = 0; i < size; i++){
            answer += (int)number.charAt(i) - 48;
        }
        
        System.out.println(size);


        return answer;
    }
}