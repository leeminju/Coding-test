class Solution {
    public String solution(String s, int n) {
        String answer = "";
        // A 65 a 97
        
        for(char c:s.toCharArray()){
            if(c == ' '){
                answer += " ";
                continue;
            }
            
            if(c+n > 'z'){
                answer += (char)(c-26+n);;
                continue;
            }
            
            if(c+n > 'Z' && c < 'a'){
                answer += (char)(c-26+n);;
                continue;
            }
                
                
            answer += (char)(c+n);
        }
        
        return answer;
    }
}