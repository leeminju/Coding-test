import java.util.PriorityQueue;


class Node{
    int index;
    int value;
    
    public Node(int index,int value){
        this.index = index;
        this.value = value;
    }
}

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        //[index,value]
        PriorityQueue<Node> queue = new PriorityQueue<>((o1, o2) -> o1.value - o2.value);
        
        for(int i=0;i<numbers.length;i++)
        {
        	int value=numbers[i];
        	
            while (!queue.isEmpty() && queue.peek().value < value) {
            	answer[queue.poll().index]=value;
            }
        	
        	queue.add(new Node(i,value));
        }
        
        while (!queue.isEmpty())
            answer[queue.poll().index] = -1;
        
        return answer;
    }
}