import java.util.*;
class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        List<int[]> list = new ArrayList<>();//광물을 5개 단위로 나누어 분류함  
        int dia = picks[0];
        int iron = picks[1];
        int stone = picks[2];
        int total = dia + iron + stone;
        
        int d=0,ir=0,s=0;
        //곡괭이를 하나 선택해서 광물 5개를 연속으로 캐고, 다음 곡괭이를 선택해서 광물 5개를 연속으로 캐는 과정을 반복
        //더 사용할 곡괭이가 없거나 광산에 있는 모든 광물을 캘 때까지
        
        for(int i=0;i<Math.min(minerals.length,total * 5);i++){
            if(i!=0 && i%5 == 0){
                list.add(new int[]{d,ir,s});
                d=0;
                ir=0;
                s=0;
            }
            
            
            if(minerals[i].equals("diamond")){
                d++;     
            }else if(minerals[i].equals("iron")){
                ir++;
            }else if(minerals[i].equals("stone")){
                s++;
            }
        }
        list.add(new int[]{d,ir,s});
        Collections.sort(list,new Comparator<int[]>(){
            public int compare(int[] o1,int[] o2){
                if(o1[0]==o2[0]){
                    if(o1[1]==o2[1]){
                        return o2[2]-o1[2];//돌이 많은 순으로 정렬
                    }else{
                        return o2[1]-o1[1];//철이 많은 순으로 정렬
                    }
                }else{
                    return o2[0]-o1[0];//다이아몬드가 많은 순으로 정렬
                }
            }
        });
        
        
        for(int i=0;i<list.size();i++){
            int[] mineral = list.get(i);
            if(dia > 0){
                answer += mineral[0] + mineral[1] + mineral[2];
                dia--;
            }else if(iron > 0){
                answer += mineral[0]*5 + mineral[1] + mineral[2];
                iron--;    
            }else{
                answer += mineral[0]*25 + mineral[1]*5 + mineral[2];
                stone--;
            }
        }
        
        
        return answer;
    }
}