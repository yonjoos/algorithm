import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};
        

        
        for(int i = 0; i < 5; i++){
            String output = "";
            if(my_string.contains(vowels[i])){
                String[] con = my_string.split(vowels[i]);

                for(String s : con){
                    output += s;
                    System.out.println(output);
                }
                my_string = output;
            }
        }
        
        answer = my_string;
        return answer;
    }
}