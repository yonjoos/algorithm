import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int len = numbers.length;
        
        int f = numbers[0] * numbers[1];
        int b = numbers[len-2]*numbers[len-1];
        
        answer = Math.max(f, b);
        
        return answer;
    }
}