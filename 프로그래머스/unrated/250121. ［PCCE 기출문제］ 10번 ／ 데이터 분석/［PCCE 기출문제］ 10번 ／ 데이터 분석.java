import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer;
        List<int[]> list = new ArrayList<>();
        int ext_num= StringToNum(ext);
        int sort_num = StringToNum(sort_by);       
        
        for(int i=0;i<data.length;i++){
            if(data[i][ext_num] < val_ext)
                list.add(data[i]);
        }
        
        Collections.sort(list,(o1,o2)->o1[sort_num]-o2[sort_num]);
        answer = new int[list.size()][4];
        
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        
        
        return answer;
    }
    
    int StringToNum(String num){
         switch(num){
            case "code":
                return  0;
            case "date":
                return 1;
            case "maximum":
                return 2;
            case "remain":
                return 3;
        }
        return -1;
    }
}