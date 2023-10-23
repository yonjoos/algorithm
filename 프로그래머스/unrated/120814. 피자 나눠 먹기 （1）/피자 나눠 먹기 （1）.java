class Solution {
    public int solution(int n) {
        int answer = 1;
    
        if( n <= 7) return answer;
        if(n % 7 != 0 && n > 7){
            answer = n / 7 + 1;
        }
        else {
            answer = n / 7;
        }
        
        return answer;
    }
}