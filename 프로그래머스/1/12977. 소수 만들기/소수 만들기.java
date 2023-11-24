class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len =nums.length;
        //소수 :  1과 자기 자신만을 약수로 가지는 수
        
        for(int i=0;i<len-2;i++){
            for(int j=i+1;j<len-1;j++){
                for(int k=j+1;k<len;k++){
                    int sum =nums[i]+nums[j]+nums[k];
                    if(isPrimeNumber(sum)){
                      answer++; 
                    }
                }
            }
        }

        return answer;
    }
    
    private boolean isPrimeNumber(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
}