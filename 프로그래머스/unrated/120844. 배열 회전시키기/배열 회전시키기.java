class Solution {
    public int[] solution(final int[] numbers, String direction) {
        int[] answer = {};
        
        int len= numbers.length;
        answer = new int[numbers.length];
                
        if(direction.equals("right")){
            for(int i=1; i <len; i++){
                answer[i] = numbers[i-1];
                for(int k = 0; k < len; k++){
                }
            }
            answer[0] = numbers[len-1];
            return answer;
        }
        for(int i = 0; i < len-1; i++){
                answer[i] = numbers[i+1]; 
            }
            answer[len-1] = numbers[0];
        
        return answer;
    }
}