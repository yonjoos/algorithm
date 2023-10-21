class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String newString = s.toLowerCase();
        System.out.println(s);
        
        char[] str = newString.toCharArray();
        
        int cntp = 0;
        int cnty = 0;
        
        for(char c : str){
            if(c == 'p') cntp++;
            else if(c == 'y') cnty++;
            
        }
        
        answer = (cntp == cnty) ? true : false;


        return answer;
    }
}