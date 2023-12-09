class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        int A = 'A';
        int a = 'a';
        
        char[] str = s.toCharArray();
        for(int i = 0; i < str.length; i++){
            int c = str[i];
            if(c == ' ') continue;
            
            if(c < a){ //capital letter
                c = A + (c - A + n)%26;
                str[i] = (char)c;
            }else{
                c = a + (c - a + n)%26;
                str[i] = (char)c;
            }
            
        }
        
        answer = new String(str);
        
        
        return answer;
    }
}