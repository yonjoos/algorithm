import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        char start = '0';
        char last = '9';
        
        List<Integer> temp = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            if(start <= my_string.charAt(i) && last >= my_string.charAt(i)){
                temp.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
            }
        }
        
        Collections.sort(temp);
        int[] ans = new int[temp.size()];
        int cnt = 0;
        for(Integer i : temp){
            ans[cnt++] = i;
        }
        
        return ans;
    }
}