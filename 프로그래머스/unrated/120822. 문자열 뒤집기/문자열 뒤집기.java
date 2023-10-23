import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        int len = my_string.length();
        
        char[] st = my_string.toCharArray();
        char[] ans = new char[len];
        
        for(int i = len-1; i>=0; i--){
            ans[i] = st[len-i-1];
        }
        
        answer = String.valueOf(ans);
        
        
        
        return answer;
    }
}