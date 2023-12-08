class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        if(!my_string.contains(is_suffix)) return 0;
        
        char[] myString = my_string.toCharArray();
        char[] suffix = is_suffix.toCharArray();
        
        int index = myString.length - 1;
        for(int j = suffix.length - 1; j >=0; j--){
            if(myString[index--] != suffix[j]){
                return 0;
            }
        }
        
        
        return 1;
    }
}