class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        
        String op=str[1];
        int a=Integer.parseInt(str[0]);
        int b=Integer.parseInt(str[2]);
        
        if(op.equals("+")){
            return a+b;
        }else if(op.equals("-")){
            return a-b;
        }else if(op.equals("*")){
            return a*b;
        }
        
        return -1;
    }
}