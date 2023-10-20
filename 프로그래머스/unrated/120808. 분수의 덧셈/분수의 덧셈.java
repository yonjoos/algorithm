class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
        int denom = denom1 * denom2;
        int numer = numer1*denom2 + numer2*denom1;
        
        for(int i = denom; i >=1; i--){
            if(denom%i == 0 && numer%i == 0){
                numer /= i;
                denom /= i;
            }
        }
        
        answer = new int[]{numer, denom};
        return answer;
    }
}