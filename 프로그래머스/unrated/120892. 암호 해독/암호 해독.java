class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        int index = -1 + code;;
        while(index <= cipher.length()-1){
            
            answer += cipher.substring(index, index+1);
            index += code;
        }
        
        return answer;
    }
}