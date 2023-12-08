import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        //정삼각형
        if(sides[0] == sides[1] && sides[1] == sides[2]) return 1;
        
        Arrays.sort(sides);
        
        if(sides[0] + sides[1] < sides[2]) return 2;
        if(sides[2] - sides[1] >= sides[0]) return 2;
        
        return 1;
        
        
        
    
        
        
    }
}