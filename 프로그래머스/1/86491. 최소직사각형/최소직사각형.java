class Solution {
    
    public void switching(int[] arr){
        
        int[] ans = new int[arr.length];
        
        int tmp; 
        tmp = arr[1];
        arr[1] = arr[0];
        arr[0] = tmp;

    }
    
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int row = sizes.length;
        int col = sizes[0].length;
        
        for(int[] s : sizes){
            if(s[0] > s[1]){
                switching(s);
            }
        }
        
        
        int maxRow = 0;
        int maxCol = 0;
        
        for(int[] r : sizes){
            maxRow = (r[0] > maxRow) ? r[0] : maxRow;
            maxCol = (r[1] > maxCol) ? r[1] : maxCol;
        }
        
        
        
        answer = maxRow * maxCol;
        return answer;
    }
}