class Solution {
    public String solution(String a, String b) {
        StringBuilder answer = new StringBuilder();
        int i=0;
        int remain = 0;
        StringBuilder num1 = new StringBuilder(a);
        StringBuilder num2 = new StringBuilder(b);
        
        num1 = num1.reverse();
        num2 = num2.reverse();
        
        for(i=0;i<Math.min(num1.length(),num2.length());i++){
            int sum = (num1.charAt(i) - '0') + (num2.charAt(i)-'0') + remain;
            if(sum < 10){
                answer.append(Integer.toString(sum));
                remain = 0;
            }else{
                answer.append(Integer.toString(sum-10)); 
                remain = 1;
            }
        }
        
        
        
         if( i < num1.length() ){
             for(;i<num1.length();i++){
                 int sum = (num1.charAt(i) - '0') + remain;
                 if(sum < 10){
                    answer.append(Integer.toString(sum));
                    remain = 0;
                }else{
                    answer.append(Integer.toString(sum-10)); 
                    remain = 1;
                }
             }
         }
        
        
         if( i < num2.length()){
            for(;i<num2.length();i++){
                 int sum = (num2.charAt(i) - '0') + remain;
                 if(sum < 10){
                    answer.append(Integer.toString(sum));
                    remain = 0;
                }else{
                    answer.append(Integer.toString(sum-10)); 
                    remain = 1;
                }
             }
         }
        
        if(remain == 1){
            answer.append("1");
        }
        
        
        return answer.reverse().toString();
    }
}