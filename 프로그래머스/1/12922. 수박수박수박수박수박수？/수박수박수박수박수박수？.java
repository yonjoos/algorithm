class Solution {
    public String solution(int n) {
        String answer = "";
        
        int times = n/2;
        if(n%2 == 0){
            for(int i = 0; i < times; i++){
                answer = answer + "수박";
            }
        }
        else{
            for(int i = 0; i < times; i++){
                answer = answer + "수박";
            }
            answer += "수";
        }
        return answer;
    }
}