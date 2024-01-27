class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String converted = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(converted);
        sb.reverse();
        converted = sb.toString();

        answer = Integer.parseInt(converted, 3);
        
        return answer;
    }
}