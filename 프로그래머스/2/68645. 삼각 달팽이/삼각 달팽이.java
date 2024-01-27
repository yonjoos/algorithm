import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int[][] temp = new int[n][n];

        int[] dx = {0, 1, -1};
        int[] dy = {1, 0, -1};
        int d = 0;
        int index = 1;
        int nx = 0, ny = 0;
        int x = 0, y = 0;

        while(true){

            temp[y][x] = index++;

            nx = x + dx[d];
            ny = y + dy[d];

            //다음 좌표가 막혀있으면 방향 변환
            if(nx == -1 || ny == -1 || ny == n || nx == n || temp[ny][nx] != 0){
                d = (d+1)%3;
                nx = x + dx[d];
                ny = y + dy[d];

                //방향 바꿨는데도 막혀있으면 종료
                if(nx == -1 || ny == -1 || ny == n || nx == n || temp[ny][nx] != 0){
                    break;
                }
            }

            x = nx;
            y = ny;

        }

        answer = new int[--index];
        int inx = 0;
        for(int[] row : temp){
            for(int i : row){
                if(i != 0){
                    answer[inx++] = i;
                }
            }
        }
        return answer;
    }
}