import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String str = my_string.replaceAll("[a-zA-Z]+", " ");

        System.out.println("str :" + str);
        if(str.charAt(0) == ' '){
            str = str.replaceFirst(" ", "");
        }
        if(str.equals("")) return 0;
        String[] strs = str.split(" ");

        System.out.println("gg");
        for(String s : strs){
            System.out.println(s);
            answer += Integer.valueOf(s);
        }
        return answer;
    }
}