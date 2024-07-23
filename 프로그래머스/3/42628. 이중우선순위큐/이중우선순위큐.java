import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
        
        for(String operation:operations){
            String[] op=operation.split(" ");
            int num = Integer.parseInt(op[1]);
            if(op[0].equals("I")){
                minHeap.offer(num);
                maxHeap.offer(num);    
            }else if(op[0].equals("D")){
                if(num == 1 && !minHeap.isEmpty()){
                    //최댓값 삭제
                    int max = maxHeap.poll();
                    minHeap.remove(max);
                }else if(num == -1  && !maxHeap.isEmpty()){
                    //최솟값 삭제
                    int min = minHeap.poll();
                    maxHeap.remove(min);
                }
            }
        }
        
        if(!minHeap.isEmpty() && !maxHeap.isEmpty()){
            answer[0]=maxHeap.poll();
            answer[1]=minHeap.poll();
        }
        
        return answer;
    }
}