class Solution {
    public int solution(int order) {
        int answer = 0;
        
        int num = order;
        int del = 10;
        int cnt = 0;
        
        while( num >= 1){
            int a = num%del;
            if((a != 0) && (a % 3 == 0)) cnt++;
            num /= del;
            
        }
        
        answer = cnt;
        return answer;
    }
}