class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            int sum = 0;
            int j = 0;

            for(j = i; j <= n; j++){
                sum += j;
                if(sum > n){
                    break;
                }
                else if(sum == n){
                    answer += 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}