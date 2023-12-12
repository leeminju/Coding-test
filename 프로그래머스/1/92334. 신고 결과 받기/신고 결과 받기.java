import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String,Integer> map =new HashMap<>();//신고 당한 사람-신고 당한 횟수
        Map<String,List<String>> map2 = new HashMap<>();//신고한 사람 - 신고 당한 사람들 리스트
              
        for(String rep:report){
            String from=rep.split(" ")[0];
            String to=rep.split(" ")[1];
            
            List<String> list = map2.getOrDefault(from,new ArrayList<>());
            if(list.contains(to)){
                continue;//내가 신고한 적 있다면 넘어간다.
            }
            list.add(to);
            map2.put(from,list);
            
            map.put(to,map.getOrDefault(to,0)+1);
        }
   
        for(int i=0;i<id_list.length;i++){
            String from = id_list[i];
            int count = 0;
            //내가 신고한 사람 중에 k번 넘게 신고 당한 사람이 있다면 정지메일을 받는다.
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