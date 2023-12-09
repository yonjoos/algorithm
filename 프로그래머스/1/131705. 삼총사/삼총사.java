class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        int len = number.length;
        
        int cnt = 0;
        
        for(int i = 0; i < len - 2; i++){
            int sum = number[i];
            for(int j = i + 1; j < len - 1; j++){
                for(int k = j + 1; k < len; k++){
                    sum = number[i] + number[j] + number[k];
                    if(sum == 0) cnt++;
                }
            }
        }
        
        answer = cnt;
        return answer;
    }
}