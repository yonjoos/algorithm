class Solution {
    public double solution(int balls, int share) {
        
        int gap = balls - share;
        if(gap == 0) return 1;
        
        int top = balls;
        int denom = share;
        if(denom > balls/2){
            denom = (balls - share);
        }
        
        int n = top - denom;
        
        double ansTop = 1;
        double ansDen = 1;
        
        //작은 것을 기준으로
        while(top > n){
            ansTop *= top--;
        }
        while(denom > 0){
            ansDen *= denom--;
        }
        
        return ansTop/ansDen;
        
        
        

        
    }
}