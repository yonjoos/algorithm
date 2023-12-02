import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        Set<Character> ans = new HashSet<>();


        for(int i = 0; i < my_string.length(); i++){

            char c = my_string.charAt(i);

            if(ans.stream().filter(o -> o == c).findAny().orElse(null) != null){
                continue;
            }

            answer += String.valueOf(c);
            ans.add(my_string.charAt(i));

        }
        
        return answer;
    }
}