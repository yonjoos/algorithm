class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int del = 10;
        int number = n;
        
        while(number >= 1){
            answer += number%del;
            number /= del;
        }
        
        return answer;
    }
}