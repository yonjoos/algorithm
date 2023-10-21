class Solution {

    public int solution(String s) {
        int answer = 0;
        
        int size = s.length();
        
        if(s.charAt(0) == '-'){
            s = s.substring(1, size);
            answer = -Integer.parseInt(s);
        }
        else if(s.charAt(0) == '+'){
            s = s.substring(1, size);
            answer = Integer.parseInt(s);
        }
        else{
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}