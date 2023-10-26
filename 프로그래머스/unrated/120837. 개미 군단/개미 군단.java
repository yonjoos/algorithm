class Solution {
    
    
    
    public int solution(int hp) {
        int answer = 0;
        

        int enemy = hp;
        int tot = 0;
            
            
        int g = enemy / 5;
        enemy -= g * 5;
            
        tot += g;
                
        int s = enemy/3;
        enemy -= s * 3;

        tot += s;

            

        int sl = enemy;   
        tot += sl;
            
        answer = tot;
        
        return answer;
    }
}