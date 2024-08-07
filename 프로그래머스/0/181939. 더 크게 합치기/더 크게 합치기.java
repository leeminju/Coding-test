class Solution {
    public int solution(int a, int b) {
        int answer = 0;
    
        int anum = Integer.toString(a).length();
        int bnum = Integer.toString(b).length();
        
        int op1 = a * (int)Math.pow(10,bnum) + b;
        int op2 = b * (int)Math.pow(10,anum) + a;
            
        return (op1 >= op2)?op1:op2;
    }
}