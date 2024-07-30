class Solution {
    public String solution(String my_string) {
        String answer = "";
        int dif = (int)'A' - 'a';
        
        for(int i=0;i<my_string.length();i++){
            char c = my_string.charAt(i);
            
            //소문자
            if(c >= 'a' && c<= 'z'){
                answer += (char)(c  + dif);
            }else{
                //대문자
                answer += (char)(c  - dif);
            }
            
        }
        
        return answer;
    }
}