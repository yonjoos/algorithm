class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int index = 0;
        
        for(int i = 0; i < n; i++){
            String str = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i])).replaceAll("1", "#").replaceAll("0", " ");
            str = str.substring(16-n, 16);
            
            answer[index++] = str;
        }
        return answer;
    }
}