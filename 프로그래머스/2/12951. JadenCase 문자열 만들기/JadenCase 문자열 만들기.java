class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("(?<= )");
        
        for(int i = 0; i < str.length; i++){
            char first = str[i].charAt(0);
            String st = str[i];
            
            if(first >= '0' && first <= '9'){
                String newString = "";
                newString = String.valueOf(first);
                st = st.toLowerCase();
                newString += st.substring(1, st.length());
                
                str[i] = newString;                
                continue;
            }
            else{
                String newString = "";
                newString += String.valueOf(first).toUpperCase();
                st = st.toLowerCase();
                newString += st.substring(1, st.length());

                str[i] = newString;                
            }
  
        }
        
        answer = String.join("", str);
        
        
        
        return answer;
    }
}