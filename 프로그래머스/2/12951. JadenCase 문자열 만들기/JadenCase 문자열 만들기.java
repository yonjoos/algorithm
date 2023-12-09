class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("(?<= )");
        
        for(int i = 0; i < str.length; i++){
            
            String st = str[i].toLowerCase();
            char first = st.charAt(0);
                        
            String newString = "";
                newString += String.valueOf(first).toUpperCase();
                newString += st.substring(1, st.length());

                str[i] = newString;        
  
        }
        
        answer = String.join("", str);
        
        
        
        return answer;
    }
}