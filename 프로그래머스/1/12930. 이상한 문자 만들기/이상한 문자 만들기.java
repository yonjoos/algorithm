class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] words = s.split("(?<= )|(?= )");

        
        for(String st : words){
            char[] tmp = new char[st.length()];
            
            for(int i = 0; i < st.length(); i++){
                if(i % 2 != 0){ //even
                    char c = Character.toLowerCase(st.charAt(i));
                    tmp[i] = c;
                    
                }
                else{ //odd
                    char c = Character.toUpperCase(st.charAt(i));
                    tmp[i] = c;
                }
            }
            
                
            answer += new String(tmp);

        }
        
        return answer;
    }
}