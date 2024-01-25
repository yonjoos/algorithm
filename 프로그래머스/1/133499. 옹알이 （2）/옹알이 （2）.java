import java.util.*;


class Solution {
    
    final static String[] component = new String[]{"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        int answer = 0;

        for(String bab : babbling){

            if(isContinue(bab)){
                continue;
            }

            for(String com : component){
                while(bab.contains(com)){
                    bab = bab.replaceFirst(com, "-");
                }
            }
            if(check(bab, "-")) { //연속해서 두 번 안 나오면서 발음할 수 있는 것들만 카운트
                answer++;
            }
        }

        return answer;
    }

    boolean isContinue(String bab){
        for(String com : component){
            if (bab.contains(com.repeat(2))){
                return true;
            }
        }
        return false;
    }
    
    boolean check(String b, String p){
        String newString = b.replaceAll(p, "");
        if(newString.length() == 0) return true;
        else return false;
    }
}