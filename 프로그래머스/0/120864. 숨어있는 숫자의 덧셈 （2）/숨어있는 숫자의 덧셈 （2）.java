class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i=0;i<my_string.length();i++){
            char c = my_string.charAt(i);
            
            if(c >= '0' && c <= '9'){
                int num = 1;
                String ans = Character.toString(c);
                
                while(i+num < my_string.length() && my_string.charAt(i+num) >= '0' && my_string.charAt(i+num) <= '9'){
                    ans += my_string.charAt(i+num);
                    num++;
                }
                answer += Integer.parseInt(ans);
                
                i+=num;
            }
        }
        
        return answer;
    }
}