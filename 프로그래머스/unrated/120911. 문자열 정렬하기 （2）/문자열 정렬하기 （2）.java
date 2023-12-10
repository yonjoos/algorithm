import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
        
        char[] myString = my_string.toCharArray();
        Arrays.sort(myString);
        
        answer = new String(myString);
        return answer;
    }
}