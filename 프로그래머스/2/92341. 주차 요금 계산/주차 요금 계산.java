import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        Map<String,Record> map = new TreeMap<>();//오름차순 정렬
        
        for(String record:records){
            String[] rec=record.split(" ");
            String time = rec[0];
            String carNum= rec[1];
            String inout = rec[2];
           
            if(inout.equals("IN")){
                if(!map.containsKey(carNum)){
                    map.put(carNum, new Record(carNum,time));
                }else{
                    map.get(carNum).in = time;
                    map.get(carNum).out = null;
                }
            }else if(inout.equals("OUT")){
                map.get(carNum).out = time;
                int sumTime = calculateTime(time,map.get(carNum).in);
                map.get(carNum).sum += sumTime;
            }
        }
        
        answer = new int[map.size()];
        int index = 0;
        
        for(String carNum:map.keySet()){
            if(map.get(carNum).out == null){
                map.get(carNum).out = "23:59";
                int sumTime = calculateTime("23:59",map.get(carNum).in);
                map.get(carNum).sum += sumTime;
            }
            
            int totalTime = map.get(carNum).sum;
            int fee = 0;
            if(totalTime <= fees[0]){
                fee = fees[1];
            }else{
              //  double value = (double)(totalTime - fees[0])/fees[2];
              //  int cal = (value - (int)value == 0) ? (int)value : (int)value + 1;
                int cal = (int) Math.ceil((double)(totalTime - fees[0])/fees[2]);
                fee = fees[1] + (cal) * fees[3];
            }   
            answer[index++] = fee;
        }
        
        
        return answer;
    }
    
    int calculateTime(String out,String in){
        int outHour=Integer.parseInt(out.split(":")[0]);
        int outMinute=Integer.parseInt(out.split(":")[1]);
        int inHour=Integer.parseInt(in.split(":")[0]);
        int inMinute=Integer.parseInt(in.split(":")[1]);
        
        if(outMinute < inMinute){
            outHour--;
            outMinute += 60;
        }
        
        return (outHour - inHour) * 60 + (outMinute - inMinute);
    }
    
    
     class Record{
         String carNum;
         String in;
         String out;
         int sum;
         
         Record(String carNum, String in){
             this.carNum = carNum;
             this.in = in;
             this.out = null;
         }
     }
    
    
    
}