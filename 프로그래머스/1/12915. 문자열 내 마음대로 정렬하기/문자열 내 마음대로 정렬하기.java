import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String str1, String str2){
                int res = str1.charAt(n) - str2.charAt(n);
                
                if(res != 0) return res;
                else{
                    res = str1.compareTo(str2);
                    return res;
                }
                
            }
        });
        
        answer = strings;
        
        return answer;
    }
}