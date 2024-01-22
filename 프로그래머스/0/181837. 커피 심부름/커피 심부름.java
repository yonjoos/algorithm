class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        int americano = 0;
        int latte = 0;
        
        for(String s : order){
            if(s.contains("americano")){
                americano++;
            }
            else if(s.contains("latte")){
                latte++;
            }
            else if(s.contains("anything")){
                americano++;
            }
        }
        
        answer = americano * 4500 + latte * 5000;
        
        
        return answer;
    }
}