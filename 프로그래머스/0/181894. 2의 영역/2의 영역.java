class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int start = -1;
        int end = -1;
        int index = 0;
        for(index = 0; index < arr.length; index++){
            if(arr[index] == 2){
                if(start != -1){
                    end = index;
                }
                else{start = index;}
            }
            
        }
        System.out.println("start = " + start);
        System.out.println("end = " + end);
        
        if(start == -1){
            return new int[]{-1};
        }
        if(start != -1 && end == -1) return new int[]{2};
        
        int[] temp = new int[end - start + 1];
        System.out.println(temp.length);
        for(int i = 0; i < temp.length; i++){
            temp[i] = arr[start + i];
        }
        
        
        return temp;
    }
}