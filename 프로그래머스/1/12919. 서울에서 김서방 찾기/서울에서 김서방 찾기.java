class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        int index = -1;
        for(int i = 0; i < seoul.length; i++){
            System.out.println(seoul[i]);
            if(seoul[i].equals("Kim")){
                index = i;
            }
        }
            
        answer = "김서방은 " + index + "에 있다";
        return answer;
    }
}