class Solution {
    public long solution(String numbers) {
        long answer = 0;

        String num = new String(numbers);

        String[][] tmp = { {"one","1"}, {"two","2"},  {"three","3"},
                {"four","4"} , {"five","5"}, {"six", "6"},
                {"seven","7"}, {"eight","8"}, {"nine","9"}, {"zero", "0"}};

        for(int i = 0; i < tmp.length; i++){
            if(num.contains(tmp[i][0])){
                num = num.replace(tmp[i][0], tmp[i][1]);
            }
        }

        answer = Long.parseLong(num);
        return answer;
    }
}