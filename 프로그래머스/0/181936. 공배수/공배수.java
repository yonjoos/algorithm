class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        if(number % n != 0) return 0;
        if(number % m != 0) return 0;
        return 1;
    }
}