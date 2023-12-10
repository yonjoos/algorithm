import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i : numlist){
            if(i%n == 0){
                ans.add(i);
            }
        }
        
        answer = new int[ans.size()];
        int index = 0;
        for(Integer i : ans){
            answer[index++] = i;
        }
        
        return answer;
    }
}