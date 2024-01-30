import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int len = s.length();
        char[] str = s.toCharArray();
        Stack<Character> stack = new Stack();
        
 
        
        for(char c : str){
            if(c == '('){
                stack.push('(');
            }
            else if(c == ')'){
                try{
                    char pop = stack.pop();
                }catch(Exception e){
                    return false;
                }
                
            }
        }
        
        if(stack.size() != 0) return false;

        System.out.println("Hello Java");

        return answer;
    }
}