class Solution {
    public int solution(String s) {
        int answer = 1;
        int start = 0;
        char x = s.charAt(0);
        int same=0;
        int not=0;
        //System.out.println(x);
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == x){
                same++;
            }else{
                not++;
            }
            
            if(same == not && same > 0){
            //
                if(i < s.length()-1){
                    i++;
                    start =i;
                    same = 1;
                    not = 0;
                    x = s.charAt(i);
                    answer++;
                }
            } 
        }
        
        
        
        
        
        return answer;
    }
}