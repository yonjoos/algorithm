import java.util.*;

public class Solution {
    
    public boolean check(int n, Stack<Integer> s){
        
        if(!s.isEmpty() && s.peek() == n){
            return false; 
        }
        
        return true;
    }
    
    
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> ans = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i : arr){
            if(check(i, ans)){
                q.offer(i);
                if(!ans.isEmpty()) ans.pop();
                ans.push(i);
            }
        }
        
        answer = new int[q.size()];
        int index = 0;
        
        while(!q.isEmpty()){
            answer[index++] = q.poll();
        }


        return answer;
    }
}