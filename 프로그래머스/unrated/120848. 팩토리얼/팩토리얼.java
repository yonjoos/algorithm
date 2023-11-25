import java.util.*;

class Solution {
    public static int solution(int n) {
        int answer = 0;

        int nth = 1;
        int former = 1;
        int cnt = 0;

        if(n == 1) return 1;
        while(former < n){

            former = nth * former;
            cnt++;
            nth++;
        }

        if(former > n) cnt--;

        answer = cnt;
        return answer;
    }
}