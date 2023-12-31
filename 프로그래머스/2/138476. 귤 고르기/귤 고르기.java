import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int t:tangerine){
            map.put(t,map.getOrDefault(t,0)+1);
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort((o1, o2) -> o2-o1);
        
        for(int i=0;i<list.size();i++){
            k -= list.get(i);
            answer++;
            if(k <= 0)
                break;
        }
        
        return answer;
    }
}