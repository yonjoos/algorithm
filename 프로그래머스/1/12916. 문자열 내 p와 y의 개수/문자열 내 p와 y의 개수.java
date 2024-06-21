class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String newString = s.toLowerCase();
        
        String ps = newString.replaceAll("[^p]", "");
        String ys = newString.replaceAll("[^y]", "");
        
        if(ps.length() == ys.length()){
            return true;
        }
        

        return false;
    }
}