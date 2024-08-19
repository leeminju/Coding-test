class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0;i<quiz.length;i++){
            String[] opr = quiz[i].split(" ");
            int ans =0;
            if(opr[1].equals("+")){
                ans = Integer.parseInt(opr[0]) + Integer.parseInt(opr[2]);
            }else{
                ans = Integer.parseInt(opr[0]) - Integer.parseInt(opr[2]);
            }
            
            if(ans == Integer.parseInt(opr[4])){
                answer[i]="O";
            }else{
                answer[i]="X";
            }
                
        }
        
        return answer;
    }
}