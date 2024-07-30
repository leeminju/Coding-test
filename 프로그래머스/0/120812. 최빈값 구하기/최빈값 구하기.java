import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num:array){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());

        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
        @Override
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
	        return o2.getValue() - o1.getValue(); //내림차순
            }
        });

        int max = 0;
        
        for(Map.Entry<Integer,Integer> entry: entryList){
            if(max < entry.getValue()){
                max = entry.getValue();
                answer = entry.getKey();
            }else if(max == entry.getValue()){
                return -1;
            }else{
                break;
            }
        }
        
        return answer;
    }
}