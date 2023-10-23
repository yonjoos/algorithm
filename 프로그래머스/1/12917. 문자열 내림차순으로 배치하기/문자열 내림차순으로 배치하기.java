import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        List<Character> capital = new ArrayList<>();
        List<Character> small = new ArrayList<>();
        
        for(char c : arr){
            if(c < 'a') capital.add(c);
            else small.add(c);
        }
        
        Collections.sort(capital, Collections.reverseOrder());
        Collections.sort(small, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder(capital.size() + small.size());
        for(char c : small){
            sb.append(c);
        }
        for(char c : capital){
            sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}