class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        char[] arr = my_string.toCharArray();
        
        for(char c : arr){
            String s = String.valueOf(c);
            String st = "";
            for(int i = 0; i < n; i++){
                st += s;
            }
            answer += st;
        }
        return answer;
    }
}