class Solution {

    public static void main(String[] args) {
        solution(new String[][]{
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP" },
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
        });
    }

    final static int[] dx = {0, -1, 1, 0};
    final static int[] dy = {-1, 0, 0, 1};


    public static boolean isNextTo(char[][] room, int x, int y, int exclude){
        for(int d = 0; d < 4; d++){
            // 오답
            if(d == exclude) continue;
            int ny = y + dy[d];
            int nx = x + dx[d];

            if(ny < 0 || room.length <= ny || nx < 0 || room[ny].length <= nx) continue;

            char stat = room[ny][nx];

            if(room[ny][nx] == 'P') return true;
        }
        return false;
    }


    public static boolean isDistanced(char[][] room, int x, int y){
        for(int d = 0; d < 4; d++){
            int ny = y + dy[d];
            int nx = x + dx[d];

            if(ny < 0 || room.length <= ny || nx < 0 || room[ny].length <= nx) continue;

            char stat = room[ny][nx];
            if(stat == 'P') return false;

            // 오답
            else if(stat == 'O'){
                if(isNextTo(room, nx, ny, 3-d)){
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean isDistanced(char[][] room){
        for(int y = 0; y < room.length; y++){
            for(int x = 0; x < room[y].length; x++){
                if(room[y][x] != 'P')continue;
                if(!isDistanced(room, x, y)) return false;
            }
        }
        return true;
    }
    public static int[] solution(final String[][] places) {
        int[] answer = new int[places.length];

        for(int i = 0; i < places.length; i++){
            String[] place = places[i];
            char[][] room = new char[place.length][];
            for(int j = 0; j < place.length; j++){
                room[j] = place[j].toCharArray();
            }
            

            answer[i] = (isDistanced(room)) ? 1 : 0;

        }

        return answer;
    }
}