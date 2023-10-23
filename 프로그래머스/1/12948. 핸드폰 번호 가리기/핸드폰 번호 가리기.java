class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        char[] numbers = phone_number.toCharArray();
        int len = numbers.length;
        
        for(int i = len - 5; i >= 0 ; i--){
            numbers[i] = '*';
        }
        
        answer = new String(numbers);
        
        return answer;
    }
}