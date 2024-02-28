import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;// 각 배포마다 몇 개의 기능이 배포되는지
        int peek = 0;// 뒤에 있는 기능을 함께 배포할 작업일 수 
        int count = 0;// 배포할 때 기능 수
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<progresses.length;i++){
            int day = (100 - progresses[i])/speeds[i];// 작업일 수 = 남은 작업 진도 / 스피드
            if((100 - progresses[i])%speeds[i] > 0){ // 나누어 떨어지지 않으면 하루 더해준다.
                day++;
            }
            
            if(day <= peek){  
                // (앞에 있는 기능의 작업기간)이 (현재 기능의 작업기간) 이상일 떄  
                // 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됨.(count를 증가 시킴)
                count++;
            }else{
                // (앞에 있는 기능의 최대 작업기간)가 (현재 기능의 작업기간) 보다 덜 걸릴 때(작을 때)
                // 앞에 있는 모든 기능을 함께 배포하고 기능의 수를 list에 추가한다. 
                if(count > 0){
                    list.add(count);
                }
                peek = day;//현재 기능의 작업기간를 (뒤에 있는 기능을 함께 배포할 작업기간)로 갱신 
                count = 1;// 현재의 기능을 포함해서 갯수를 센다.
            }
        }
        
        list.add(count);// 남은 기능 배포하고 그 갯수 저장 
        
        answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}