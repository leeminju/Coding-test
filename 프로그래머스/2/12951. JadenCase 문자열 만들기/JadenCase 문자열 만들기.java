class Solution {
    public String solution(String s) {
        s = s.toLowerCase();// 일단 모두 소문자로 변경
        // a -97  A - 65    32
        StringBuilder sb = new StringBuilder(s);
        int first = 0;
        
        int x = s.indexOf(" ",first);
        if(x == first){
            while(s.charAt(x) == ' ' && x < s.length()){
                x++;
            }
            first = x;// 공백 이후의 인덱스
        }
   
        
        while(first < s.length()){
            if(sb.charAt(first) < '0' || sb.charAt(first) > '9'){
                sb.setCharAt(first, (char)(sb.charAt(first) - 32));//숫자가 아닐 때 대문자로 변경
            }
            x = s.indexOf(" ",first);// first 이후에 공백문자의 인덱스 반환
            //뒤에 더이상 공백이 존재하지 않을 때 종료
            if(x == -1){
                break;
            }
              
            while(x < s.length()){
                if(s.charAt(x) == ' '){ 
                    x++;
                }else{
                    break;
                }
            }
            first = x;// 공백 이후의 인덱스
            
         }
                   
        
        return sb.toString();
    }
}