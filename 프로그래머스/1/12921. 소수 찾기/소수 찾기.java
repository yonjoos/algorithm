import java.util.*;

class Solution {
    static List<Integer> prim = new ArrayList<>();

    public int solution(int n) {
        int answer  = 1;
        if(n == 2) return 1;

        for(int num = 3; num <= n ; num++){
            if(check(num)){
                answer++;
            }
        }

        return answer;
    }

    boolean check(int num){
        boolean result = false;
        if(num%2 == 0) return false;

        int sqrt = (int)Math.ceil(Math.sqrt(num));

        boolean flag = false;
        for(int i = 0; i < prim.size(); i++){
            if(prim.get(i) > sqrt) break;
            if(num % prim.get(i) == 0){
                flag = true;
                break;
            }
        }

//        for(Integer i : prim){
//            if(num % i == 0){
//                flag = true;
//                break;
//            }
//        }

        if(!flag) {
            prim.add(num);
            return true;
        }

        return result;
    }
}