import java.util.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        
        int row = num_list.length/n;
        answer = new int[row][n];
                
        int index = 0;
        int a = 0;
        int b = n;
        while(index < row){
            int ind = 0;
            int[] temp = new int[n];
            for(int i = 0; i < n; i++){
                temp[ind++] = num_list[a++];
            }
                        
            answer[index] = temp;
            index++;
        }
        
        return answer;
    }
}