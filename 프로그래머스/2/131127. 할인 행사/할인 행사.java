import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String,Integer> map = new HashMap<>();
         
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
                if(isOk(want,number,map)){
                    answer++;
                } 
            }
            
        }
        
        return answer;
    }
    
    boolean isOk(String[] want, int[] number, Map<String,Integer> map){
        for(int i=0;i<want.length;i++){
            String key = want[i];
            int value = number[i];
            
            if(!map.containsKey(key)){
                return false;
            }else if(map.get(key) < value){
                return false;
            }
        }

        return true;
    }
    
    
}