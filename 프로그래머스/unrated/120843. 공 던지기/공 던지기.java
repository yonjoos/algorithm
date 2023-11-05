class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int index = 1;
        int trial = 1;
        while(trial < k){
            index += 2;
            
            if(index > numbers.length){
                index = index % numbers.length;
            }
            trial++;
        }
        
        answer = numbers[index-1];
        return answer;
    }
}