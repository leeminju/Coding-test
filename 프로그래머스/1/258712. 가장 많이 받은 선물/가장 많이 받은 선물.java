import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int n = friends.length;
        int[][] count = new int[n][n];
        int[] arr = new int[n];//받은 선물 수 저장
        
        Map<String,Integer> indexMap = new HashMap<>();// 사람 이름 , 인덱스
        Map<String,Integer> giveMap = new HashMap<>();// 선물 준 사람 , 선물 갯수
        Map<String,Integer> takeMap = new HashMap<>();// 선물 받은 사람, 선물 갯수
        
            
        for(int i=0;i<n;i++){
            indexMap.put(friends[i],i); 
        }
            

        for(String gift:gifts){
            String from=gift.split(" ")[0];
            String to=gift.split(" ")[1];
            
            count[indexMap.get(from)][indexMap.get(to)]++;
            
            giveMap.put(from,giveMap.getOrDefault(from,0)+1);
            takeMap.put(to,takeMap.getOrDefault(to,0)+1);
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j)
                    continue;
                
                if(count[i][j] > count[j][i]) //i가 j에게 준 선물 수 > j가 i에게 준 선물 수
                {
                    arr[i]++;                   
                }else if(count[i][j] == count[j][i] && i<j){
                    // 사람이 선물을 주고받은 기록이 하나도 없거나 주고받은 수가 같다면
                    int valueI = giveMap.getOrDefault(friends[i],0) - takeMap.getOrDefault(friends[i],0);//i의 선물지수
                    int valueJ = giveMap.getOrDefault(friends[j],0) - takeMap.getOrDefault(friends[j],0);//j의 선물지수
                    
                    if(valueI > valueJ){
                        arr[i]++;
                    }else if(valueI < valueJ){
                        arr[j]++;
                    }
                }
            }
        }
        
       
        
        for(int i=0;i<n;i++){
            answer = Math.max(answer,arr[i]);
        }
        
        
        return answer;
    }
}