import java.util.*;
class Solution {
    
    public String[] solution(String[][] plans) {
        String[] answer = new String[plans.length];
        int idx = 0;
        Stack<Homework> stack = new Stack<>();// 멈춰둔 과제 저장
        Arrays.sort(plans,(o1,o2)->o1[1].compareTo(o2[1]));// 시작 시간 순 정렬
        
        String currentTime = plans[0][1];
        
        for(int i=0 ;i < plans.length; i++){
            // 현재시간이 현재 과제 시작시간보다 빠르다면? 남아있는 과제 처리
            while(currentTime.compareTo(plans[i][1])<0 && !stack.isEmpty()){
                Homework hw = stack.pop();
                
                String endTime = CalculateEndTime(currentTime,hw.remainTime);
                
                // 종료 시간이 다음 과제 시작 시간 보다 빨리 끝난다면
                if(endTime.compareTo(plans[i][1]) <= 0){
                     // 과제 종료
                    answer[idx++] = hw.subject;
                    currentTime = endTime;//현재 시간을 종료시간으로 업데이트
                }else{
                    // 남아 있는 시간 계산하고 스택에 추가
                    int remain_time = CalculateRemainTime(plans[i][1],currentTime,hw.remainTime);
                    stack.push(new Homework(hw.subject,remain_time));
                    currentTime = plans[i][1];//현재 시간을 현재 과제 시작 시간으로 업데이트
                }
            }
            
            String endTime= CalculateEndTime(plans[i][1],Integer.parseInt(plans[i][2]));
           
            // 마지막 과제라면
            if(i == plans.length-1){
                answer[idx++] = plans[i][0];
                break;
            }
            
            // 종료 시간이 다음 과제 시작 시간 보다 빨리 끝난다면
            if(endTime.compareTo(plans[i+1][1]) <= 0){
                // 과제 종료
                answer[idx++] = plans[i][0];
                currentTime = endTime;//현재 시간을 종료시간으로 업데이트
            }else{
                // 남아 있는 시간 계산하고 스택에 추가
                int remain_time = CalculateRemainTime(plans[i+1][1],plans[i][1],Integer.parseInt(plans[i][2]));
                
                stack.push(new Homework(plans[i][0],remain_time));
                currentTime = plans[i+1][1];//현재 시간을 다음 과제 시작 시간으로 업데이트
            }
            
        }
        
        while(!stack.isEmpty()){
            Homework hw = stack.pop();
            answer[idx++] = hw.subject;
        }
    
        return answer;
    }
    
    String CalculateEndTime(String start, int playtime){
        String hour = start.split(":")[0];
        String minute = start.split(":")[1];
        int new_minute = Integer.parseInt(minute) + playtime;
        
        int new_hour =   Integer.parseInt(hour) + (new_minute / 60);
        new_minute %= 60;

        if(new_minute < 10){
            minute = "0" + new_minute;
        }else{
            minute = Integer.toString(new_minute);
        }
        
        if(new_hour < 10){
            hour = "0" + new_hour;
        }else{
            hour = Integer.toString(new_hour);
        }
        
        return hour+":"+minute;
    }
    
    int CalculateRemainTime(String next_start,String cur_start,int playtime){
      
        int nhour = Integer.parseInt(next_start.split(":")[0]);
        int nminute = Integer.parseInt(next_start.split(":")[1]);
        
        int chour = Integer.parseInt(cur_start.split(":")[0]);
        int cminute = Integer.parseInt(cur_start.split(":")[1]);
        
        int real_play=0;
        
        if(nhour > chour){
            nhour--;
            nminute += 60;
        
            real_play = (nhour - chour) * 60 + (nminute - cminute);
        }else{
            real_play = nminute - cminute;
        }

        return playtime-real_play;
    }
    
    
}

class Homework{
    String subject;// 과목명
    int remainTime;
    
    public Homework(String subject,int remainTime){
        this.subject = subject;
        this.remainTime = remainTime;
    }
}