import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        answer = Arrays.stream(numlist).filter(o -> o%n==0).toArray();
        return answer;
    }
}