class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int pizza = 1;
        
        if(n <= slice) return pizza;
        else{
            
            pizza = (n + slice - 1) / slice;
            answer = pizza;
            
        }
        
        return answer;
    }
}