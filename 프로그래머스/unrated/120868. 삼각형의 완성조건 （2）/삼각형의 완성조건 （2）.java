import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        if(sides[0] == sides[1]){
            int max = 2*sides[0] - 1;
            return max;
        }
        else{
            int max = sides[0] + sides[1] - 1;
            int min = sides[1] - sides[0] + 1;
            return max - min + 1;
        }
        
    }
}