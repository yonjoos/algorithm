import java.util.*;
class Solution {
    
    public void makeIt(boolean[][] flag, int c, int r){
        int col = flag[0].length;
        int row = flag.length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if((Math.abs(i-r)+Math.abs(j-c) < 2)){
                    flag[i][j] = true;
                }
                else if(Math.abs(i-r) == 1 && Math.abs(j-c)==1){
                    flag[i][j] = true;
                }
                
            }
        }
    }
    
    public int solution(int[][] board) {
        int answer = 0;
        
        int col = board[0].length;
        int row = board.length;
        
        boolean[][] flag = new boolean[row][col]; //false로 초기화
        boolean[][] flag2 = new boolean[row][col]; //false로 초기화
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 1){
                    flag2[i][j] = true;
                }
            }
        }
        
        for(int i = 0; i < flag2.length; i++){
            for(int j = 0; j < flag2[0].length; j++){
                if(flag2[i][j]){
                    int r = i;
                    int c = j;
                    makeIt(flag,c, r);
                }
            }
        }
        
        for(boolean[] b : flag){
            for(boolean bb : b){
                if(bb == false) answer++;
            }
        }

        return answer;
    }
}