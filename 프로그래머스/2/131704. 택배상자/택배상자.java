import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;// 몇 개의 상자를 실을 수 있는지 
        //현재 컨테이너
        Queue<Integer> main = new LinkedList<>();
        //보조 컨테이너
        Stack<Integer> sub = new Stack<>();
            
        ;
        for(int i=1;i<=order.length;i++){
            main.offer(i);
        }

        int index = 0;

        while(!main.isEmpty()){
            if(main.peek() != order[index]){
                if(!sub.isEmpty() && sub.peek() == order[index]){
                    sub.pop();
                    index++;
                    answer++;//트럭에 싣다.
                }else{
                    sub.push(main.poll());//보조컨테이너에 잠시 보관
                }
            }else if(main.peek() == order[index]){
                main.poll();
                index++;
                answer++;//트럭에 싣다.
            }
        }
        
        while(!sub.isEmpty()){
             if(sub.peek() == order[index]){
                sub.pop();
                index++;
                answer++;//트럭에 싣다.
            }else{
                break;
            }
        }
            
        return answer;
    }
}