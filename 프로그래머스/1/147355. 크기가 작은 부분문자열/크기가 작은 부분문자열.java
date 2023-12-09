class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        char[] subString = t.toCharArray();
        Long pnum = Long.parseLong(p);
        int size = p.length();

        int count = 0;

        int len = subString.length;


        for(int i = 0; i < subString.length - size + 1; i++){
            String num = "";

            for(int j = 0; j < size; j++){
                num += String.valueOf(subString[i + j]);
            }

            Long number = Long.parseLong(num);
            if (number <= pnum) count++;
        }

        answer = count;
        System.out.println(answer);
        return answer;
    }
}