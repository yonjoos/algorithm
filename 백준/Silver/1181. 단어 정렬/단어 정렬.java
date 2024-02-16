import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {


    public static void main(String[] args) throws Exception{
        HashSet<String> tmp = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            tmp.add(br.readLine());
        }

        List<String> tempList = new ArrayList<>(tmp);

        StringBuilder sb = new StringBuilder();

        Collections.sort(tempList, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                int len = o1.length() - o2.length();
                if(len == 0){
                    return o1.compareTo(o2);
                }

                return len;
            }
        });

        tempList.stream().forEach(o -> sb.append(o + "\n"));

        System.out.println(sb);
        br.close();
    }

}