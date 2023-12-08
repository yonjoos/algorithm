class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        
        int front = 0;
        int back = arr.length;
        for(int i = 0; i < query.length; i++){
            if(i%2 == 0){
                back = query[i];
            }
            else{
                front += query[i];
                back -= query[i];
                
            }
        }
        
        System.out.println(front);
        System.out.println(back);
        
        answer = new int[back + 1];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr[i + front];
        }
        
        
        return answer;
    }
}