import java.util.*;
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        char[] charArray = my_string.toCharArray();
        char let = letter.charAt(0);
        
        List<Character> arr = new ArrayList<>();
        
        for(char c : charArray){
            if(c != let){
                arr.add(c);
            }
        }
        
        for(char c : arr){
            answer += String.valueOf(c);
        }
        
            
        return answer;
    }
}