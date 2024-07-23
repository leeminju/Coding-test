import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int i=0;i<scoville.length;i++){
            pq.offer(scoville[i]);
        }
        
        while(!pq.isEmpty()){
            if(pq.peek() < K){
                int first = pq.poll();
                if(!pq.isEmpty()){
                    int second = pq.poll();
                
                    int mix = first + second * 2;
                    count++;
                    pq.offer(mix);
                }else{
                    count = -1;
                    break;
                }
            }else{
                break;
            }
        }
        
        
        return count;
    }
}