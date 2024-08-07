import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(delete_list);
        
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=delete_list.length-1;j>=0;j--){
                if(arr[i] == delete_list[j]){
                    flag = true;
                    break;
                }else if(arr[i] > delete_list[j]){
                    break;
                }
            }
            
            if(!flag)
                list.add(arr[i]);
        }
        
        answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}