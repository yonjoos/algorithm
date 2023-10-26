class Solution {
    
    
    
    public int solution(int hp) {
        int answer = 0;
        
        
        
        int last = hp;
        for(int i = 0; i < 2; i++){
            int enemy = hp;
            int tot = 0;
            
            if(i == 0){
                int g = enemy / 5;
                enemy -= g * 5;
                System.out.println("g : "+g);
            
                tot += g;
                
                int s = enemy/3;
                enemy -= s * 3;
                System.out.println("s : "+s);

                tot += s;
            }
            if(i == 1){
                
                int s = enemy/3;
                enemy -= s * 3;
                System.out.println("s : "+s);

                tot += s;
                
                int g = enemy / 5;
                enemy -= g * 5;
                System.out.println("g : "+g);
            
                tot += g;

            }
            

            int sl = enemy;
            
            tot += sl;
            System.out.println("total : "+tot);
            
            
            if(last >= tot){
                last = tot;
                System.out.println("last : "+last);
            }
            System.out.println();
            System.out.println();
        }
        
        answer = last;
        
        return answer;
    }
}