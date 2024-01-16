class Solution {
    public String solution(String polynomial) {
        String answer = "";

        String[] strs = polynomial.split(" ");

        int x = 0;
        int v = 0;

        for(String s : strs){
            if(s.equals("+")) continue;
            if(s.contains("x")){
                String ss = s.replace("x", "");
                if(ss.equals("")) ss = "1";
                x += Integer.valueOf(ss);
            }
            else{
                v += Integer.valueOf(s);
            }
        }

        if(x == 0) answer = "" + v;
        else{
            
            answer = 
                ((x == 1) ? "x" : x + "x" ) + 
                ((x * v != 0) ? " + ": "") + 
                ((v == 0) ? "" : v);
        }

        return answer;
    }
}