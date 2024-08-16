class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int d = common[1]-common[0];
        
        if(d == common[2]-common[1]){
            return common[common.length-1]+ d;
        }else{
            int r = common[1]/common[0];
            return common[0] * (int)Math.pow(r,common.length);
        }
    }
}