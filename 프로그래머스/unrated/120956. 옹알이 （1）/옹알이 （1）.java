import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> list = List.of("aya", "ye", "woo", "ma");

        for(String bab:babbling){
            if(list.contains(bab)){
                answer++;
                continue;
            }

            int same = 0;

            for(int i=0;i<4;i++){
                String word = list.get(i);
                if(bab.contains(word)){
                    same += word.length();                    
                }
            }  


            if(same == bab.length()){
                answer++;
            }
        }

        return answer;
    }
}