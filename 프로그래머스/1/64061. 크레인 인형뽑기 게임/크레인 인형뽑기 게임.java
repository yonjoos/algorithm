import java.util.*;

class Solution {
    
    static int cnt = 0;
    
    public void pushItem(Stack<Integer> stack, int item){
        
        if(!stack.isEmpty()){
            int p = stack.peek();
            if(p == item){
                cnt += 2;
                stack.pop();
            }
            else stack.push(item);
        }
        else{
            stack.push(item);
        }

    }
    
    public int findItem(int[][] board, int move){
        
        int maxindex = board.length-1;
        int returnNum = -1;

        for(int row = 0; row <= maxindex; row++ ){
            if(board[row][move] != 0){
                returnNum = board[row][move];
                board[row][move] = 0;
                return returnNum;
            }
        }
        
        return 0;
    }
    
    
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        
        int rowSize = board.length;
        int colSize = board[0].length;
        
        int moveTimes = moves.length;
        
        for(int i = 0; i < moveTimes; i++){
            int move = moves[i] - 1;
            
            int item = findItem(board, move);
            
            if(item != 0){
                pushItem(stack, item);
            }

        }

        answer = cnt;
        return answer;
    }
}