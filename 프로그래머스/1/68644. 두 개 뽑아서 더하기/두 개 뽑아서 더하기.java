import java.util.*;

class Solution {
    
    public boolean check(final int n, final int[] flag){
        if(flag[n] == 1) return false;
        return true;
    }
    
    
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int[] flag = new int[200];
        
        List<Integer> arr = new ArrayList<>();
        
        int size = numbers.length;
        
        for(int i = 0; i < size-1; i++){
            for(int j = i+1; j < size; j++){
                int num = numbers[i] + numbers[j];
                if(check(num, flag)){
                    arr.add(num);
                    flag[num] = 1;
                }
            }
        }
        
        Collections.sort(arr);
        int len = arr.size();
        
        int index = 0;
        answer = new int[len];
        for(Integer i : arr){
            answer[index++] = i;
        }
        

        
        return answer;
    }
}