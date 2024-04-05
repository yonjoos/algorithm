import java.util.*;


class Solution {
    class Count {

        private int zero;
        private int one;


        public Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }

        public Count() {
        }

        public Count add(Count other){
            int zero = this.zero + other.zero;
            int one = this.one + other.one;


            return new Count(zero, one);
        }

        public int getZero() {
            return zero;
        }

        public int getOne() {
            return one;
        }
    }
    public int[] solution(int[][] arr) {
        int[] answer = {};


        Count ans = count(0,0, arr.length, arr );

        answer = new int[]{ans.getZero(), ans.getOne()};


        return answer;
    }

    public Count count(int offsetX, int offsetY, int size, final int[][] arr){

        for(int x = offsetX; x < offsetX + size; x++){
            for(int y = offsetY; y < offsetY + size; y++){
                if(arr[y][x] != arr[offsetY][offsetX]){

                    int h = size/2;

                    Count ret = count(offsetX, offsetY, h, arr)
                            .add(count(offsetX + h, offsetY, h, arr))
                            .add(count(offsetX, offsetY + h, h, arr))
                            .add(count(offsetX + h, offsetY + h, h, arr));


                    return ret;
                }
            }
        }

        Count count;
        if(arr[offsetY][offsetX] == 1){
            count = new Count(0, 1);
        }
        else {
            count = new Count(1, 0);
        }

        return count;
    }
}