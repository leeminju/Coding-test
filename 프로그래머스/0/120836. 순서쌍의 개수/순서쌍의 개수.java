class Solution {
    public int solution(int n) {
        int answer = 0;
        int add =0;
        
        for(int num=1;num<=Math.sqrt(n);num++){
            if(n%num==0){
                if(num == n/num){
                    add=1;     
                }else{
                    answer++;
                }
            }
        }        
        return answer*2 + add;
    }
}