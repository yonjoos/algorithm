class Solution {
    public long solution(String numbers) {
        long answer = 0;

        String num = new String(numbers);

        String[] tmp = {"zero", "one", "two", "three",
                        "four", "five", "six", "seven",
                        "eight", "nine"};

        for(int i = 0; i < tmp.length; i++){
            if(num.contains(tmp[i])){
                num = num.replace(tmp[i], String.valueOf(i));
            }
        }

        answer = Long.parseLong(num);
        return answer;
    }
}