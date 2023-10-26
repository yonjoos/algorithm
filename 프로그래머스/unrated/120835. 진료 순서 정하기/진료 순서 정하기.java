import java.util.*;
class Solution {
    public int[] solution(final int[] emergency) {
        int size = emergency.length;
        
        int[] temp = new int[size];
        
        for(int i = 0; i < size; i++){
            temp[i] = emergency[i];
        }
        
        int[] ans = new int[size];
        Arrays.sort(temp);


        
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(emergency[i] == temp[j]){
                    ans[i] = size - j;
                }
            }            
        }
        
        return ans;
    }
}