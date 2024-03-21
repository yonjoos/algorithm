class Solution {

    private static final int dx[] = {0,-1,1,0};
    private static final int dy[] = {-1, 0,0,1};

    private static boolean isNextToVolunteer(char[][] room, int x, int y, int exclude){
        for(int d = 0; d < 4; d++){
            if(d == exclude)continue;
            
            int nx = x + dx[d];
            int ny = y + dy[d];
            
            if(nx < 0 || ny <= 0 || nx >= room.length || ny >= room.length) continue;
            
            if(room[ny][nx] == 'P') return true;
        }
        
        return false;
    }
    
    private static boolean isDistanced(char[][] room, int x, int y){
        for(int d =0; d < 4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx < 0 || ny < 0 || nx >= room.length || ny >= room.length) continue;
            
            char stat = room[ny][nx];
            if(stat == 'P') return false;
            else if (stat == 'O'){
                if(isNextToVolunteer(room, nx, ny, 3-d)) return false;
            }
            
        }
        return true;
    }
    
    private static boolean isDistanced(char[][] room){
        for(int y = 0; y < room.length; y++){
            for(int x = 0; x < room[y].length; x++){
                if(room[y][x] != 'P')continue;
                if(!isDistanced(room, x, y)) return false;
            }
        }
        return true;
    }
    public static int[] solution(final String[][] places) {
        
        int[] ans = new int[places.length];
        for(int i = 0; i < places.length; i++){
            String[] place = places[i];
            char[][] room = new char[place.length][];
            for(int j = 0; j < room.length; j++){
                room[j] = place[j].toCharArray();
            }
            ans[i]= isDistanced(room) ? 1 : 0;
        }
        
        return ans;
    }
}