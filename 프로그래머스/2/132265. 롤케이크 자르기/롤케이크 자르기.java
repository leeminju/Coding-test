import java.util.*;
class Solution {
    public int solution(int[] topping) {
    int answer=0;
    Map<Integer,Integer> map = new HashMap<>();// (토핑 종류. 개수)   
    Map<Integer,Integer> map2 = new HashMap<>();// (토핑 종류. 개수)   
    
    //철수행님이 먼저 토핑들을 전부 다 차지해버린다.   
    for(int t : topping){
        map.put(t,map.getOrDefault(t,0)+1);
    }    

        
    //동생님이 뒤로 입장하여, 철수행님이 차지한 토핑들을 하나씩 뺏어버린다.
    for(int i=topping.length-1;i>=0;i--){
       map.put(topping[i],map.get(topping[i])-1);
       
      //갯수가 0이되면 맵에서 삭제 시킴
       if(map.get(topping[i])==0){
           map.remove(topping[i]);
       }
       map2.put(topping[i],map2.getOrDefault(topping[i],0)+1);
       
        //동생이 더 많아지면 종료 시킴
        if(map.size() < map2.size()){
            break;
        }
       
       //동생이 뺏을 때마다, 각자 가지고 있는 토핑의 종류가 같은지 확인한다.
       //같다면 답을 추가한다.
       if(map.size() == map2.size()){
           answer++;
       }
       
      
       
    }
        return answer;
    }
}