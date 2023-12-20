import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int len = elements.length;
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>(); 
        
        for(int i=0;i<len;i++){
            set.add(elements[i]);// 길이가 1인 부분 수열의 함
            queue.offer(elements[i]);//큐에 값을 넣기
        }
        
        for(int size=2;size<len;size++){
            int count = 0;
            int sum = 0;           
            Queue<Integer> tempQ= new LinkedList<>();
            
            for(int i=0;i<len+size-1;i++){
                int temp = queue.poll();
                tempQ.offer(temp);
                sum += temp;
                count++;
                if(count == size){
                    set.add(sum);
                    count = size-1;// 맨 앞에 것만 제거
                    sum -= tempQ.poll();
                }
                queue.offer(temp);//다시 뒤로 넣어주기
            }
        }
            
        
        return set.size() + 1;//원래 길이 만큼의 부분수열= 1개
    }
}