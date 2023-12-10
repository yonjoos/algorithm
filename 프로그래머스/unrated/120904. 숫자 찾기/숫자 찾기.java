class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String s = String.valueOf(num);
        String kk = String.valueOf(k);
        
        if(s.contains(kk)){
            return s.indexOf(kk) + 1;
        }
        return -1;
    }
}