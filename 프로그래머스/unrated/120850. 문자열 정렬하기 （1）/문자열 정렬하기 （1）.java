import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        String str = my_string.replaceAll("[A-Z|a-z]", "");
        
        char[] tmp = str.toCharArray();
        
        Arrays.sort(tmp);
        
        int[] ans = new int[tmp.length];
        int cnt = 0;
        for(char c : tmp){
            ans[cnt++] = c-'0';
        }
        return ans;
    }
}