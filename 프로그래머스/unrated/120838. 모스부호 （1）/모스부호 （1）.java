class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String m = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f','--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l','--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r','...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x','-.--':'y','--..':'z' ";
        
        String[] temp = m.split(",");
        String[][] T = new String[temp.length][2];
        int index = 0;
        
        for(String t : temp){
            String[] tmp = t.split(":");
            T[index++] = tmp;
        }
        
        index--;
        
        for(int i = 0; i < T.length; i++){
            String a = String.valueOf(T[i][0]);
            String b = String.valueOf(T[i][1]);
                        
            a = a.substring(1, a.length()-1);
            b = b.substring(1, b.length()-1);
            if(b.contains("z")) b = b.substring(0, b.length()-1);

            
            T[i][0] = a;
            T[i][1] = b;
        }

        String[] input = letter.split(" ");


        for(String s : input){
            for(int i = 0; i < T.length; i++){
                if(T[i][0].equals(s)){
                    answer += String.valueOf(T[i][1]);
                    break;
                }
            }
        }
        
        
        return answer;
    }
}