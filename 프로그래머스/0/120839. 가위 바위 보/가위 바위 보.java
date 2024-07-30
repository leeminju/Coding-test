class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(int i=0;i<rsp.length();i++){
            char c = rsp.charAt(i);
            if(c == '2'){
                //가위
                answer += "0";
            }else if(c == '0'){
                //바위
                answer += "5";
            }else if(c == '5'){
                //보
                answer += "2";
            }
        }
        
        return answer;
    }
}