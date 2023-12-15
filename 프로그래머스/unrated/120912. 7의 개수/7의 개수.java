import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        String[] arr = new String[array.length];
        int index = 0;
        for(int i : array){
            arr[index++] = String.valueOf(i);
        }
        
        for(String s : arr){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '7') answer++;
            }
        }
        return answer;
    }
}