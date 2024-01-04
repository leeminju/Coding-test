class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String str=Integer.toString(n,k);
        
        while(str.length() >0){
            int index = str.indexOf("0");
            if(index ==-1){
                
                long lastnum =Long.parseLong(str);
                if(isPrimeNumber(lastnum)){
                    answer++;
                }
                
                break;
            }
            String newStr =str.substring(0,index);
            if(newStr.length()>0){
                long num =Long.parseLong(newStr);
                if(isPrimeNumber(num)){
                    answer++;
                }
            }
            
            str = str.substring(index+1);
        }
        
        return answer;
    }
    
    boolean isPrimeNumber(Long num){
        if(num == 1){
            return false;
        }
        for(long i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}