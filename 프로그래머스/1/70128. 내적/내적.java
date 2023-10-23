class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        
        int len = a.length;        
        int ans = 0;
        for(int i = 0; i < len; i++){
            ans += a[i] * b[i];
        }
        
        answer = ans;
        return answer;
    }
}