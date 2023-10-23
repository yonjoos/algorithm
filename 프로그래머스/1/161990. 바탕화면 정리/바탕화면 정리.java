class Solution {
    
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        
        int row = wallpaper.length;
        int col = wallpaper[0].length();
        
        char[][] arr = new char[row][col];
        int ind = 0;
        for(String s : wallpaper){
            arr[ind++] = s.toCharArray();
        }
        
        int lux = row-1, luy =col-1 , rdx = 0, rdy = 0;
        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                if(arr[r][c] == '#'){
                    if(rdx <= r){
                        rdx = r+1;
                    }
                    if(rdy <= c){
                        rdy = c+1;
                    }
                    if(lux > r){
                        lux = r;
                    }
                    if(luy > c){
                        luy = c;
                    }

                }
            }
        }
        
        answer = new int[]{lux, luy, rdx, rdy};
        
        return answer;
    }
}