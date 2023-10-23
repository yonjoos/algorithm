class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        int len = s.length();
        if(len == 4 || len == 6){}
        else return false;
        
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(c < '0'|| c > '9') return false;
        }
        
        return answer;
    }
}