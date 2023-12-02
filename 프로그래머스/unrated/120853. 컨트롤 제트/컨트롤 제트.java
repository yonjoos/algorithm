class Solution {
    public static int solution(String s) {
        int answer = 0;
        int temp = 0;

        String[] arr = s.split(" ");

        for(String str : arr){
            if(str.equals("Z")){
                answer -= temp;
                temp = 0;
            }
            else{
                int number = Integer.valueOf(str);
                temp = number;
                answer += number;

            }
        }


        return answer;
    }
}