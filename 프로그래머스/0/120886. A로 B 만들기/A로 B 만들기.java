import java.util.*;
class Solution {
    public int solution(String before, String after) {
        Map<Character,Integer> map = new HashMap<>();// 문자, 빈도 수
        
        for(int i=0;i<before.length();i++){
            char c = before.charAt(i);
            
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(int i=0;i<after.length();i++){
            char c = after.charAt(i);
            
            if(!map.containsKey(c)){
                return 0;
            }
            
            map.put(c, map.get(c) -1);// 갯수 빼기
        }
        
        for(char key : map.keySet()){
            if(map.get(key) != 0)
                return 0;
        }
        
        return 1;
    }
}