import java.util.*;
import java.util.stream.Collectors;


class Solution {
    public List<Integer> solution(String[] strlist) {
        //int[] answer = {};
        
        List<Integer> answer = Arrays.stream(strlist).map(o -> o.length()).collect(Collectors.toList());
        


        return answer;
    }
}