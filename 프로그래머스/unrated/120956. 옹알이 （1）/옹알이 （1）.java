class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] known = new String[]{"aya", "ye", "woo", "ma" };
        String[] knowns = new String[24 + 12];
        
        int index = 0;
        for(int i = 0; i < known.length; i++){
            for(int j = 0; j < known.length; j++){
                if(j == i) continue;
                for(int k = 0; k < known.length; k++){
                    if(k == i || k == j) continue;
                    String know = "" + known[i] + known[j] + known[k];
                    knowns[index++] = know;
                }
            }
        }
        
        for(int i = 0; i < known.length; i++){
            for(int j = 0; j < known.length; j++){
                if(j == i) continue;
                String know = "" + known[i] + known[j];
                knowns[index++] = know;
            }
        }
        
    
        for(String b :babbling){
            for(String k : knowns){
                if(b.equals(k)) answer++;
            }
            for(String k : known){
                if(b.equals(k)) answer++;
            }
            int cnt = 0;
            for(String k: known){
                if(b.contains(k)) cnt++;
            }
            if (cnt == 4) answer++;
        }
        return answer;
    }
}