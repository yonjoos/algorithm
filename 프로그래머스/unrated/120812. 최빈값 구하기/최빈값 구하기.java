import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int[] cnt = new int[1000];
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++){
            cnt[array[i]]++;
        }
        
        
        int max = 0;
        int index = -1;
        for(int i = 0; i < 1000; i++){
            if(max < cnt[i]) {max = cnt[i]; index = i;}
        }
        
        for(int i = 0; (i < 1000); i++){
            if(max == cnt[i] && ( i != index)) return -1;
        }
        
        answer = index;
                
        return answer;
    }
}