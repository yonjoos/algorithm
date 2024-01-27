class Solution {
    public int[] solution(String s) {

        int[] answer = new int[s.length()];

        int len = s.length();
        for(int index = 0; index < len; index++){
            String component = String.valueOf(s.charAt(index));

            String subString = s.substring(0, index);
            if(subString.contains(component)){
                int ind = findIndex(subString, s.charAt(index));
                answer[index] = ind;
            }
            else{
                answer[index] = -1;
            }
        }


        return answer;
    }

    private int findIndex(String s, char comp){
        int len = s.length();
        int index = -1;
        for(int i = len-1; i >= 0; i--){
            if(s.charAt(i) == comp){
                index = i;
                break;
            }
        }

        index = len - index;
        return index;
    }

}