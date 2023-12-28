import java.util.*;

public class Node{
    int index;
    int value;
    
    public Node(int index,int value){
        this.index = index;
        this.value = value;
    }
    
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Node> q = new LinkedList<>();
        PriorityQueue<Node> pq = new PriorityQueue<>((o1,o2)->o2.value - o1.value);
        
        for(int i=0;i<priorities.length;i++){
            Node node = new Node(i,priorities[i]);
            pq.offer(node);
            q.offer(node);
        }
        
        while(!q.isEmpty()){
            Node node = q.poll();
            
            if(node.value < pq.peek().value){
                q.offer(node);// 뒤에 넣기
            }else{
                pq.poll();
                answer++;
                
                if(node.index == location){
                    return answer;
                }
            }
            
        }
        
        return answer;
    }
}