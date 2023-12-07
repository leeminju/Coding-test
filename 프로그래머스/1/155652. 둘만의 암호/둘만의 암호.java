class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(char c : s.toCharArray()){
            int plus = index;
            char ans=c;
            for(int i=0;i<=plus;i++){
                char temp = (char)(c+i);
                if(skip.contains(Character.toString(temp))){
                    plus++;
                }
                if(temp == 'z'){
                    c = 'a'-1;
                    plus = plus-i;
                    i = 0;
                }
                ans = temp;
            }
            answer+=ans;
           
        }
        
        return answer;
    }
}