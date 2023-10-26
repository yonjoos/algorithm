class Solution {
    public String solution(int age) {
        String answer = "";
        
        String ageString = Integer.toString(age);
        int size = ageString.length();
        
        int startIndex = 'a' - '0';
        
        for(int i = 0; i < size; i++){
            char c = ageString.charAt(i);
            int index = c + startIndex;
            char alphabet = (char)index;
            answer += String.valueOf(alphabet);
        }
        
        return answer;
    }
}