import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list=new ArrayList<>();
        
        int year = Integer.parseInt(today.substring(0,4));
        int month = Integer.parseInt(today.substring(5,7));
        int day = Integer.parseInt(today.substring(8));
                                   
        int todayNum = (year - 1) * (28 * 12)  + (month -1) * 28 + day;
        
        Map<String,Integer> termsMap = new HashMap<>();
        
        for(String str:terms){
            String kind =str.split(" ")[0];
            int term= Integer.parseInt(str.split(" ")[1]);
            termsMap.put(kind,term);
        }
        int num=0;
        
        for(String privacy : privacies){
             num++;
             String startDate = privacy.split(" ")[0];
             int syear = Integer.parseInt(startDate.substring(0,4));
             int smonth = Integer.parseInt(startDate.substring(5,7));
             int sday = Integer.parseInt(startDate.substring(8));
                                   
            int sDateNum = (syear - 1) * (28 * 12)  + (smonth -1) * 28 + sday;
            
            
            String kind = privacy.split(" ")[1];
            int term = termsMap.get(kind);
            sDateNum += term * 28;// 만료일
            if(todayNum >= sDateNum){
                list.add(num);
            }
        }
        
        int[] answer  = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        
        return answer;
    }
}