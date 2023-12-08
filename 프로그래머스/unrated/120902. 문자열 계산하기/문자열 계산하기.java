import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] a = my_string.split(" ");
        
        String op = "";
        answer += Integer.parseInt(a[0]);
        for(int i = 1; i < a.length; i++){
            String s = a[i];
                
            if(s.equals("+") ||s.equals("-")){
                op = s;
            }
            else{
                int num = Integer.parseInt(s);
                if(op.equals("+")){
                    answer += num;
                }
                else{
                    answer -= num;
                }
            }
        }
        
        
        
        return answer;
    }
}