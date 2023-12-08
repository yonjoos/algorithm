class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        int a = 'a';
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= a){
                answer += String.valueOf(Character.toUpperCase(c));
            }
            else if( c < a){
                answer += String.valueOf(Character.toLowerCase(c));
            }
            
        
        }
        
        return answer;
    }
}