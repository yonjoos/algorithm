import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        Arrays.sort(array);
        
        int MinGap = 100;
        int index = -1;
        
        for(int i = 0; i < array.length; i++){
            int Gap = Math.abs(array[i] - n);
            if(Gap < MinGap){
                MinGap = Gap;
                index = i;
            }
        }
        
        answer = array[index];
        
        return answer;
    }
}