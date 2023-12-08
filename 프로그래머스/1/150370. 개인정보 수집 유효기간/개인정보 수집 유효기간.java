import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        ArrayList<Integer> answer=new ArrayList<Integer>();
        HashMap<String,Integer> AgreementMap=new HashMap<>();

        int idx=0;
        
        String[] t=today.split("\\.");
		int todayCnt = Integer.parseInt(t[0]) * 10000 + Integer.parseInt(t[1]) * 100 + Integer.parseInt(t[2]);
        
    
        for(String str:terms)
        {
        	String[] st=str.split(" ");
        	AgreementMap.put(st[0], Integer.parseInt(st[1]));//계약 당 기간 저장
        }
        
        for(String str:privacies)
        {
        	idx++;//1부터 시작
        	
        	int year=Integer.parseInt(str.substring(0, 4));
        	int month=Integer.parseInt(str.substring(5, 7));
        	int day=Integer.parseInt(str.substring(8, 10));
        	int term=AgreementMap.get(str.substring(11, 12));//유효기간
        	int end=0;
        	month += term;
        	
        	if(month>12) {
        		year+=month/12;
        		if(month%12==0){
                    month=12;
                    year--;
                }
                else{
                    month%=12;
                }
        	}
        	end=year*10000+month*100+day;
        	
        	if(todayCnt >= end)//지났으면 파기
            {
                answer.add(idx);
        	}
        }
        
        int[] answer2=new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            answer2[i]=answer.get(i);
        }
      
        
        return answer2;
    }
    
    
}