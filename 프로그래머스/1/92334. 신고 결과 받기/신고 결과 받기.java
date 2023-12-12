import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String,Integer> map =new HashMap<>();//신고 당한 사람-신고 당한 횟수
        Map<String,List<String>> map2 = new HashMap<>();
              
        for(String rep:report){
            String from=rep.split(" ")[0];
            String to=rep.split(" ")[1];
            

            
            List<String> list = map2.getOrDefault(from,new ArrayList<>());
            if(list.contains(to)){
                continue;
            }
            list.add(to);
            map2.put(from,list);
            
            map.put(to,map.getOrDefault(to,0)+1);
        }
   
        for(int i=0;i<id_list.length;i++){
            String from = id_list[i];
            int count = 0;
            if(map2.get(from)!= null){
                List<String> list = map2.get(from);
                
                for(String to:list){
                    if(map.get(to)>= k){
                        count++;
                    }
                }    
            }
            answer[i]=count;
        }
        
        
        return answer;
    }
}