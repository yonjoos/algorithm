class Solution {
    public int[][] solution(int n) {
        int[][] answer = {};
        
        answer = new int[n][n];
        
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        int d = 0;
        int x = 0;
        int y = 0;
        
        
        
        int number = 1;
        
        while(true){
            answer[y][x] = number++;
            
            int nx = x + dx[d];
            int ny = y + dy[d];
            
     
            
            if(ny < 0 || nx < 0 || ny == n || nx == n || answer[ny][nx] != 0 ){
                d = (d + 1)%4;
                nx = x + dx[d];
                ny = y + dy[d];

                if( ny < 0 || nx < 0 || ny == n || nx == n || answer[ny][nx] != 0){
                    break;
                }
                  
            }
            x = nx;
            y = ny;
            
        }
            
            
        return answer;
    }
}