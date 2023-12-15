import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int length = (int) Math.ceil((double)my_str.length()/n);
        answer = new String[length];
        int index = 0;
        
        
        while(my_str.length() > 0){
            if(my_str.length() <= n) n = my_str.length();
            String s = my_str.substring(0, n);
            my_str = my_str.substring(n, my_str.length());
            answer[index++] = s;
        }
        
        return answer;
    }
}