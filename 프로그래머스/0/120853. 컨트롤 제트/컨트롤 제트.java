class Solution {
    public int solution(String s) {
        int answer = 0;
        int before=0;
        
        String[] operation = s.split(" ");
        
        for(String op:operation){
            if(op.equals("Z")){
                answer -= before;
            }else{
                before = Integer.parseInt(op);
                answer += before;
            }
        }
  
        return answer;
    }
}