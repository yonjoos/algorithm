import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] str = s.toCharArray();
        
        int a = 'a';
        int z = 'z';
        int[] alp = new int[z-a +1];
        
        Arrays.sort(str);

        for(char c : str){
            alp[c - 'a']++;
        }
        
        
        for(int i = 0; i < alp.length; i++){
            if(alp[i] == 1) {
                char c = (char) (i + a);
                System.out.println(c);
                answer += String.valueOf(c);
            }
        }
        
        
        return answer;
    }
}