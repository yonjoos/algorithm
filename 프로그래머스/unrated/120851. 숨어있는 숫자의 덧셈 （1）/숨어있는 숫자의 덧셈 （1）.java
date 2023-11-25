class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String str = my_string.replaceAll("[A-Z|a-z]", "");
        char[] numbers = str.toCharArray();
        
        int sum = 0;
        for(char c : numbers){
            sum += c-'0';
        }
        
        answer = sum;
        return answer;
    }
}