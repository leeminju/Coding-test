class Solution {
    public String solution(String s) {
        String answer = "";
        int j = 0;
        for(int i = 0;i<s.length();i++,j++){    
            char c = s.charAt(i);

            if(c == ' '){
                j = -1;
                answer += " ";
                continue;
            }

            if(j % 2 == 0){
                answer += Character.toString(c).toUpperCase();
            }else{
                answer += Character.toString(c).toLowerCase();
            }
        } 
        return answer;
    }
}