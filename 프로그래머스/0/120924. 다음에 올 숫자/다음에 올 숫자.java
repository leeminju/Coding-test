class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int d = common[1]-common[0];
   
        
        if(is_등차수열(common,d)){
            return common[common.length-1]+ d;
        }else{
            int r = common[1]/common[0];
            return common[0] * (int)Math.pow(r,common.length);
        }
    }
    
    boolean is_등차수열(int[] array,int d){
        for(int i=1;i<array.length;i++){
            if(d  != array[i]-array[i-1]){
                return false;
            }
        }
        return true;
    }
}