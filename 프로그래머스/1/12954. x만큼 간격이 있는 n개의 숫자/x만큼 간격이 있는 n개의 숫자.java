class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        int index = 0;
        long num = 0;
        while(n>0){
            num += x;
            answer[index++] = num;
            n--;
        }
        return answer;
    }
}