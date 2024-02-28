import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        PriorityQueue<Node> q = new PriorityQueue<>((o1,o2)->o2.price - o1.price);
        //가격 높은 순, 최신 순
       
        for(int i=0;i<prices.length;i++){
            while(!q.isEmpty() &&q.peek().price > prices[i]){
                //감소
               answer[q.peek().time] = i - q.peek().time;
               q.poll();
            }
            
            q.offer(new Node(i,prices[i]));//i초에 prices[i]원 주식 구매
        }
        
        while(!q.isEmpty()){
            answer[q.peek().time] = prices.length - q.peek().time -1;
            q.poll();
        }
        
        
        
        return answer;
    }
    
    class Node{
        int time;// 구매한 시간
        int price;//구매한 가격
        
        Node(int time,int price){
            this.time = time;
            this.price = price;
        }
    }
}