class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        

        for(String c : arr){
            int n = Integer.parseInt(c);
            if(n > max) max = n;
            else if (n < min) min = n;
        }
        
        answer = min + " " + max;
        return answer;
    }
}