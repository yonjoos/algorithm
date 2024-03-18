import java.util.*;

class Solution
{
    public static void main(String[] args) {
        solution(new int[]{1, 4, 2},new int[]{5, 4, 4});
    }
    public static int solution(int []A, int []B)
    {
        int answer = 0;

        int indexA = 0;
        int indexB = B.length-1;

        final int len = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;

        for(int i = 0; i < len; i++){
            int a = A[indexA++];
            int b = B[indexB--];
            sum += a * b;
        }

        answer = sum;
        return answer;
    }
}