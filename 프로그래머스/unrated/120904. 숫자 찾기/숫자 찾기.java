class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String s = String.valueOf(num);
        String kk = String.valueOf(k);
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == kk.charAt(0)) return i + 1;
        } 
        return -1;
    }
}