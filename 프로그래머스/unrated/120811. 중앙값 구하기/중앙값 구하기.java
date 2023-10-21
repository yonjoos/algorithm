import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int size = array.length;
        
        Arrays.sort(array);
        
        return array[size/2];
    }
}