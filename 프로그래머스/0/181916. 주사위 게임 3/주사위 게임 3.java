import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(a,map.getOrDefault(a,0)+1);
        map.put(b,map.getOrDefault(b,0)+1);
        map.put(c,map.getOrDefault(c,0)+1);
        map.put(d,map.getOrDefault(d,0)+1);
        
        
        if(map.size()==1){
            return 1111 * a;
        }
        
        // Comparator 정의        
        Comparator<Entry<Integer, Integer>> comparator = new Comparator<Entry<Integer, Integer>>() {                    @Override            
            public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {                
                return e1.getValue().compareTo(e2.getValue());
            }
        };
        
        if(map.size()==2){
            // Max Value의 key, value        
            Entry<Integer, Integer> maxEntry = Collections.max(map.entrySet(), comparator);         
            // Min Value의 key, value        
            Entry<Integer, Integer> minEntry = Collections.min(map.entrySet(), comparator);
            
            if(maxEntry.getValue() == 3){
                int p = maxEntry.getKey();
                int q = minEntry.getKey();
                return (int)Math.pow(10 * p + q,2);
            }else if(maxEntry.getValue() == 2){
                int p=0,q=0,count=0;
                for(int key : map.keySet()){
                    if(count == 0){
                        p = key;
                    }else{
                        q = key;
                    }
                    count++;
                }
                
                return (p + q) * Math.abs(p-q);
            }
        }
        
        if(map.size()==3){
            // Max Value의 key, value        
            Entry<Integer, Integer> maxEntry = Collections.max(map.entrySet(), comparator);         
            int mul = 1;
            for(int key : map.keySet()){
                if(maxEntry.getKey() != key){
                    mul *= key;
                }
            }
            return mul;
        }
        
        if(map.size()==4){
            Entry<Integer, Integer> minEntry = Collections.min(map.entrySet(), comparator);
            return minEntry.getKey();        
        }
        
        return answer;
    }
}