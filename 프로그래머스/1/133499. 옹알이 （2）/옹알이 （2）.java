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
                    int count = count(bab,word);
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
    
    int count(String str, String word){
        int count = 1;
        while(true){
            int find = str.indexOf(word);
            String split = str.substring(find + word.length());//앞에를 자르기    
                    
            if(split.contains(word)){
                count++;
                if(split.indexOf(word) == 0){
                    return -1; //연속된 글자
                }else{   
                    str = split; 
                }
            }else{
                 return count;
            }
        }
    }
}