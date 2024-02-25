import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char capital = 'A';
        char small = 'a';
        char[] chars = a.toCharArray();
        
        for (char c : chars){
            System.out.print((c < small) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
 
    }
}