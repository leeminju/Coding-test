import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] array = emergency.clone();// 원본 저장
        int[] answer = new int[n];
        Map<Integer,Integer> map = new HashMap<>();// 숫자, 순서
        
        Arrays.sort(emergency);
        int order = n;
        
        for(int i=0;i<n;i++){
            map.put(emergency[i],order--);
        }
        
        for(int i=0;i<n;i++){
            answer[i]=map.get(array[i]);
        }
        
        return answer;
    }
}