import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character,Integer> map = new HashMap<>();
        
        for(String key:keymap){
            for(int i=0;i<key.length();i++){
                char eng=key.charAt(i);
                if(map.getOrDefault(eng,1000) > i+1){
                    map.put(eng,i+1);
                }
            }
        }
        
    loop :  for(int i=0;i<targets.length;i++){
            String target = targets[i];
            int sum = 0;
            for(int j=0;j<target.length();j++){
                char eng = target.charAt(j);
                if(!map.containsKey(eng)){
                    answer[i] = -1;
                    continue loop;
                }else{
                    sum += map.get(eng);
                }   
            }
             answer[i] = sum;
            
        }
        
        
        return answer;
    }
}