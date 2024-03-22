class Solution {
    
    public double getRadius(int x, int y){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    
    public long solution(int r1, int r2) {
        long answer = 0;
        
        for(int x = 1; x <= r2; x++){
            long maxH = (long)Math.sqrt(Math.pow(r2,2) - Math.pow(x, 2));
            long minH = (long)Math.ceil(Math.sqrt(Math.pow(r1,2) - Math.pow(x, 2)));
            
            answer += maxH - minH + 1;
        }
        
        
        answer *= 4;        
        return answer;
    }
}