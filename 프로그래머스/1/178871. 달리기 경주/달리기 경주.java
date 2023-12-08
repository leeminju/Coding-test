import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<players.length;i++){
            map.put(players[i],i);
        }
        
        for(String calling:callings){
            int cur = map.get(calling);//현재 위치
            String front = players[cur-1];//앞에 있는 사람

            
            players[cur] = front;
            players[cur-1] = calling;
            map.put(front,cur);
            map.put(calling,cur-1);
        }
        
        
        return players;
    }
}