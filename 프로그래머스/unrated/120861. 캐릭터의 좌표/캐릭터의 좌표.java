class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};

        answer = new int[]{0,0};
        int width = (board[0]) / 2;
        int height = (board[1]) / 2;

        for(String s : keyinput){
            if(s.equals("up")){
                if(answer[1] < height) answer[1]++;

            }
            else if (s.equals("down")){
                if(answer[1] > -height) answer[1]--;

            }
            else if(s.equals("left")){
                if(answer[0] > -width) answer[0]--;

            }
            else{
                if(answer[0] < width) answer[0]++;

            }
        }


        return answer;
    }
}