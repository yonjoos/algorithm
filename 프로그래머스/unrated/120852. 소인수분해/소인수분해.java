import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};

        List<Integer> integers = new ArrayList<>();
        int number = n;
        for(int i = 2; i <= n; i++){
            if(number % i == 0) {
                while(number % i == 0){
                    number /= i;

                }
                integers.add(i);
            }

        }
        int size = integers.size();
        int[] ans = new int[size];
        int cnt = 0;
        for(Integer i : integers){
            ans[cnt++] = i;
        }


        return ans;
    }
}