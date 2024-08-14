class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int num =0;
        String[] opr = my_string.split(" ");
        
        for(int i=opr.length-1;i>=0;i--){
            // 연산자
            if(i%2 == 1){
                if(opr[i].equals("+")){
                    answer += num;
                }else{
                    answer -= num;
                }
            }else{
                num = Integer.parseInt(opr[i]);
            }
        }
        answer += num;
        
        return answer;
    }
}