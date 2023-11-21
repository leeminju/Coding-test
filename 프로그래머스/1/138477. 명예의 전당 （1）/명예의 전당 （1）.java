import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue();
        int i=0;
        
        for(int s : score){
            if(pq.size() < k){
                pq.offer(s);
            }else if(s > pq.peek()){
                pq.poll();
                pq.offer(s);
            }
            answer[i++]=pq.peek();
        }
        
        return answer;
    }
}