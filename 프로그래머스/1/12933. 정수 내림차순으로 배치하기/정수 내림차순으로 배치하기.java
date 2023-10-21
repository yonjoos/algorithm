import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String s = Long.toString(n);
        char[] chars = s.toCharArray();
        
        char[] temp = new char[chars.length];
        
        Arrays.sort(chars);
        for(int i = 0; i < chars.length; i++){
            temp[i] = chars[chars.length-1-i];
        }
        
        s = new String(temp);
        
        answer = Long.parseLong(s);
        return answer;
    }
}