class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
        int lcm = -1;
        for(int i = 1; i <= denom1*denom2 ; i++){
            if(i % denom1 == 0 && i % denom2 == 0){
                lcm = i;
                break;
            }
        }
        
        int num1 = (lcm/denom1) * numer1;
        int num2 = (lcm/denom2) * numer2;
        
        int num = num1 + num2;
        
        int n = 0;
        for(int i = 1; i <= num && i <= lcm; i++){
            if(num%i == 0 && lcm%i == 0){
                n = i;
            }
        }
        
        answer = new int[]{(num1 + num2)/n, lcm/n};
        return answer;
    }
}