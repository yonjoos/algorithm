class Solution {
    public static int solution(int i, int j, int k) {
        int answer  = 0;

        for(int number = i ; number <= j; number++){
            String str = String.valueOf(number);

            if(!str.contains(String.valueOf(k))) continue;

            for(int index = 0; index < str.length(); index++){
                if(str.charAt(index) == (char)(k + '0')){
                    answer++;
                }
            }
        }

        return answer;
    }
}