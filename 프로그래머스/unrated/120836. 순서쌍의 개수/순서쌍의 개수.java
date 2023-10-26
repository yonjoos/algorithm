class Solution {
    public int solution(final int n) {
        int answer = 0;
        
        int num = n;
        for(int i = 1; i <= num; i++){
            if(n%i == 0){
                answer++;
            }
        }
        
        
        return answer;
    }
}