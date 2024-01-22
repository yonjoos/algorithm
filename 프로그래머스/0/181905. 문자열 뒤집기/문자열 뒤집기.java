import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String sub = my_string.substring(s, e+1);
        char[] temp = sub.toCharArray();
        char[] temp2 = new char[temp.length];
        for(int i = 0; i < temp.length; i++){
            temp2[i] = temp[temp.length -1 - i];
        }
        String tmp = String.valueOf(temp2);
        answer = my_string.substring(0, s);
        answer += tmp;
        System.out.println(tmp);
        answer += my_string.substring(e+1);
        
        
        return answer;
    }
}