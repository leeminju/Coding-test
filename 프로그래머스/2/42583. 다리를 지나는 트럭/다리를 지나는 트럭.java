import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> queue = new LinkedList<>();
        int sec = 1;
        int i = 0;
        int bridge_wegiht = truck_weights[0];
        queue.offer(new Truck(bridge_length+1,truck_weights[0]));
        //truck_weights[0]kg의 트럭이 1초에 진입하고 bridge_length초 동안 있다가 통과
        //1 + bridge_length 초에 다리 통과
        
        
        while(i < truck_weights.length){
            sec++;

            if(!queue.isEmpty() && sec == queue.peek().endTime){
                bridge_wegiht -= queue.poll().weight;
                //맨앞에 있는 트럭의 통과시간이 되면 
                //다리에서 트럭의 무게뺴주고 큐(다리)에서 삭제시킨다
            }
       
          
            
            //현재 큐(다리)의 크기가 다리에 올라갈 수 있는 트럭 수 미만이면서
            //새로운 트럭이 들어왔을 때 다리가 견딜 수 있는 무게를 넘지 않을 때  
            // 새로운 트럭 진입(무게 추가) 
            // 끝나는 시간은 진입시간 + 트럭의 길이
            if(queue.size() < bridge_length && i+1 < truck_weights.length && bridge_wegiht + truck_weights[i+1]<= weight){
                queue.offer(new Truck(sec + bridge_length,truck_weights[i+1]));
                bridge_wegiht += truck_weights[i+1];
                i++;
            }
 
            //모든 트럭이 큐(다리)를 다 통과했다면 시간 반환 
            if(queue.isEmpty()){
                return sec;
            }
        }
        
        return 0;
    }
    
    class Truck{
        int endTime;
        int weight;
        
        Truck(int endTime,int weight){
            this.endTime = endTime;
            this.weight = weight;
        }
    }
}