class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 1;
        int pieces = 6;
        
        while((pizza * pieces) % n != 0){
            pizza++;
        }
        
        answer = pizza;
        
        return answer;
    }
}