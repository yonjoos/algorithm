class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = {};
        answer = new String[quiz.length];
        int index = 0;
        
        for(String q : quiz){
            String[] equation = q.split(" ");
            int len = equation.length;
            
            int sum = Integer.parseInt(equation[0]);
            int finalSum = Integer.parseInt(equation[len-1]);
            
            for(int i = 1; i < len-2; i = i + 2){
                int num = Integer.parseInt(equation[i+1]);
                if(equation[i].equals("+")){
                    sum += num;
                }
                else if(equation[i].equals("-")){
                    sum -= num;
                }
            }
            
            if(sum == finalSum){
                answer[index++] = "O";
            }
            else answer[index++] = "X";
        }
        
        
        return answer;
    }
}