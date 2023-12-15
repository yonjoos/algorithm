import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        List<Integer[]> distances = new ArrayList<>();
        
        int x= dots[0][0];
        int y= dots[0][1];
        
        int xDis = 0;
        int yDis = 0;
        for(int i = 1; i < dots.length; i++){
            if(dots[i][0] == x){
                yDis = Math.abs(y - dots[i][1]);
            }
            if(dots[i][1] == y){
                xDis = Math.abs(x - dots[i][0]);
            }
        }
        
        answer = xDis * yDis;
        return answer;
    }
}