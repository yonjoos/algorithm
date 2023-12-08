import java.util.*;


class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        Arrays.sort(array);
        for(int i : array){
            if (i == n) answer++;
        }
        
        
        return answer;
    }
}