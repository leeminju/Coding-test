import java.util.*;
class Solution {
    int answer = 0;
    public int solution(int x, int y, int n) {
        int answer = -1;
        Queue<Node> q = new LinkedList<>();
    
        //첫 갱신이 답이 되는 것을 유도하기 위해 하향식 접근으로 y->x 의 과정을 /3, /2, -n 순서로 진행했으며
        //while문에서 계산 결과가 x가 되는 경우는 바로 count를 return 하도록 구현하니 다행히도 잘 풀렸네요!
        
        q.offer(new Node(y,0));
        
        while(!q.isEmpty()){
            Node node = q.poll();
            double sum = node.sum;
            int count = node.count;
 
            
            if(sum == x){
                return count;
            }
         
            if(sum > x){
              if(sum/3 == (int)sum/3){ 
                q.offer(new Node(sum / 3,count+1));
              }
              if(sum/2 == (int)sum/2){ 
                q.offer(new Node(sum / 2,count+1));
              }
              q.offer(new Node(sum - n,count+1));
            }
        }
        
        return answer;
    } 
    class Node {
        double sum;
        int count;
        
        Node(double sum, int count){
            this.sum = sum;
            this.count = count;
        }
    }
}