class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double a = (int)Math.sqrt(n);
        double b = Math.sqrt(n);
        if(a==b) answer = ((long)(b+1))*((long)(b+1));
        else return -1;
        return answer;
    }
}