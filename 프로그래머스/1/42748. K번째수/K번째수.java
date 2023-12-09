import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        answer = new int[commands.length];
        int index = 0;
        
        for(int[] command : commands){
            int i = command[0];
            int j = command[1];
            int k = command[2];
            
            int size = j - i + 1;
            int[] temp = new int[size];
            
            for(int l = 0; l < size; l++){
                temp[l] = array[l + i - 1];
            }
            
            Arrays.sort(temp);
            
            answer[index++] = temp[k-1];
            
        }
        return answer;
    }
}