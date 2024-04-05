import java.util.*;


class Solution {
    
    static int[][] arr;
    public int[] solution(int[][] array) {
        int[] answer = {};

        arr = array;
        
        Count count = count(0,0, array.length);

        return new int[]{count.zero, count.one};
    }
    
    public Count count(int offsetX, int offsetY, int size){
        
        int first = arr[offsetY][offsetX];
        int mid = size/2;
        
        for(int y = offsetY; y < offsetY + size; y++){
            for(int x = offsetX; x < offsetX + size; x++){
                if(arr[y][x] != first){
                    
                    Count ret = count(offsetX, offsetY, mid);
                    ret = ret.add(count(offsetX + mid, offsetY, mid));
                    ret = ret.add(count(offsetX, offsetY + mid, mid));
                    ret = ret.add(count(offsetX + mid, offsetY + mid, mid));
                    
                    return ret;
                }
                
            }
        }
        
        if(first == 1) return new Count(0, 1);
        return new Count(1, 0);
    }
    
    
    class Count {
        int zero;
        int one;
        
        Count(int zero, int one){
            this.zero = zero;
            this.one = one;
        }
        
        public Count add(Count other){
            return new Count(zero + other.zero, one + other.one);
        }
    }

  
}