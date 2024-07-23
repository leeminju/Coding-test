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
                if(num == 1){
                    //최댓값 삭제
                    int max = maxHeap.poll();
                    minHeap.delete(max);
                }else{
                    //최솟값 삭제
                    int min = minHeap.poll();
                    maxHeap.delete(min);
                }
            }
        }
        
        System.out.println(minHeap.toString());
        System.out.println(maxHeap.toString());
        
        return answer;
    }
}