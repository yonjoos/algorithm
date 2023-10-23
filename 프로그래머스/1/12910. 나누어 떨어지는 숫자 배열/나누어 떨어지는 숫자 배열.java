import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i : arr){
            if(i % divisor == 0){
                ans.add(i);
            }
        }
        if(ans.size() == 0) return new int[]{-1};
        
        Collections.sort(ans);
        
        int len = ans.size();
        int[] arr2 = new int[len];
        for(int i = 0; i < len; i++){
            arr2[i] = ans.get(i);
        }
        
        answer = arr2;
        
        return answer;
    }
}