import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        for(String str1 : s1){
            for(String str2 : s2){
                if(str1.equals(str2)) answer++;
            }
        }
        
        
        return answer;
    }
}