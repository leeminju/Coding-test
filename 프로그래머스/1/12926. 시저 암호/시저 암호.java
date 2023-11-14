class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(char c:s.toCharArray()){
            if(c == ' '){
                answer += " ";
                continue;
            }
            
            if((c+n > 'z')||(c+n > 'Z' && c < 'a')){
                answer += (char)(c-26+n);;
                continue;
            }
            
            answer += (char)(c+n);
        }
        
        return answer;
    }
}