class Solution {
    
    private String[][] alp = {
        {"zero", "0"}, {"one", "1"}, {"two", "2"}, {"three", "3"},
        {"four", "4"}, {"five", "5"}, {"six", "6"}, {"seven", "7"},
        {"eight", "8"}, {"nine", "9"}
    };
    
    public int solution(String s) {
        int answer = 0;
        
        for(String[] str : alp){
            if(s.contains(str[0])){
                s = s.replaceAll(str[0], str[1]);
            }
        }
        
        answer = Integer.parseInt(s);
        return answer;
    }
}