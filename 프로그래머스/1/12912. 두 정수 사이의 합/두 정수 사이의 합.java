class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a == b) return a;
        
        int max = (a < b) ? b : a;
        int min = (a < b) ? a : b;
        
        long sum = 0;
        
        for(int i = min; i <= max; i++){
            sum += i;
        }
        
        answer = sum;
        return answer;
    }
}