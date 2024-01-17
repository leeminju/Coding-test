import java.util.PriorityQueue;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        //[index,value]
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        
        for(int i=0;i<numbers.length;i++)
        {
        	int value=numbers[i];
        	
            while (!queue.isEmpty() && queue.peek()[1] < value) {
            	answer[queue.poll()[0]]=value;
            }
        	
        	queue.add(new int[]{i,value});
        }
        
        while (!queue.isEmpty())
            answer[queue.poll()[0]] = -1;
        
        return answer;
    }
}