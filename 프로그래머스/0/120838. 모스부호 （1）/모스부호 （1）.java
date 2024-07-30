import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int num = 0;
        
        Map<String,Character> map = new HashMap<>();
        for(String m :morse){
            map.put(m,(char)('a'+num++));
        }
        
        

        String[] words = letter.split(" ");// 공백 기준으로 구분
        
        for(String word: words){
            answer += map.get(word);
        }
        
        return answer;
    }
}