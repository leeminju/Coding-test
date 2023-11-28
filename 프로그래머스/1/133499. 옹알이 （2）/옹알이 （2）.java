import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> list = List.of("aya", "ye", "woo", "ma");
        
        for(String bab:babbling){
            if(list.contains(bab)){
                answer++;
                continue;
            }
            
            int same = 0;
            
            for(int i=0;i<4;i++){
                String word = list.get(i);
                if(bab.contains(word)){
                    int count = 1;
                    
                    String temp = bab;
                    while(true){
                        int find = temp.indexOf(word);
                        String splitBab = temp.substring(find + word.length());    
                    
                        if(splitBab.contains(word)){
                            count++;
                            if(splitBab.indexOf(word) == 0){
                                count = -1;
                                break; //연속된 글자
                            }else{
                                temp = splitBab; 
                             }
                        }else{
                            break;// 글자 뒤에 같은 글자 없음!
                        }
                    }
                        
                        
                    if(count != -1){    
                        same += word.length()*count;
                    }
                }
            }  
            
            
            if(same == bab.length()){
                answer++;
            }
        }
        
        return answer;
    }
}