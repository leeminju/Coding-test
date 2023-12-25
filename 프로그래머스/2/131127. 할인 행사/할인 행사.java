import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> answer_map = new HashMap<>();
        
        for(int i=0;i<want.length;i++){
            answer_map.put(want[i],number[i]);
        }
        
        
        for(int i=0;i<discount.length;i++){
            if(i >= 10){
                String remove = discount[i-10]; 
                if(map.containsKey(remove)){
                    map.put(remove,map.get(remove)-1);
                }
            }
            
            String key = discount[i];
            map.put(key,map.getOrDefault(key,0)+1);
            
            if(i >= 9){
                if(isOk(answer_map,map)){
                    answer++;
                } 
            }
            
        }
        
        return answer;
    }
    
    boolean isOk(Map<String,Integer> answer_map,Map<String,Integer> map){
        for(String key:answer_map.keySet()){
            if(!map.containsKey(key)){
                return false;
            }else if(map.get(key) < answer_map.get(key)){
                return false;
            }
        }

        return true;
    }
    
    
}