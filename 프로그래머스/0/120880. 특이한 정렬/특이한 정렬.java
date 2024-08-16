import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Node[] array= new Node[numlist.length];// 숫자와 n과의 거리를 저장
        
        for(int i=0;i<numlist.length;i++){
            array[i] = new Node(numlist[i], Math.abs(numlist[i] - n));
        }
        
        Arrays.sort(array);
        
        for(int i=0;i<array.length;i++){
            Node node=array[i];
            answer[i]=node.num;
        }
        
        return answer;
    }
    class Node implements Comparable<Node>{
        int num;//해당하는 숫자
        int distance;//n과의 거리
        
        public Node(int num,int distance){
            this.num = num;
            this.distance = distance;
        }
        
        @Override
        public int compareTo(Node node){
            if(this.distance == node.distance){
                //n과의 거리가 같다면 더 큰 숫자가 먼저
                return node.num - this.num;
            }
            //거리가 짧은 것이 먼저
            return this.distance - node.distance;
        }
    }      
}
