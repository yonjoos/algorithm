import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                ans.add(i);
            }
        }
        
        
        return ans;
    }
}