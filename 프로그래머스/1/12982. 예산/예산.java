import java.util.*;
class Solution {
    public int solution(int[] d, final int budget) {
        int answer = 0;
        
        int size = d.length;
        int bud = budget;
        
        Arrays.sort(d);
        
        for(int i = 0; i < size; i++){
            bud -= d[i];
            if(bud < 0) break;
            else answer++;
        }
        
        
        
        return answer;
    }
}