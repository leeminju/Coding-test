class Solution {
    public int solution(int a, int b) {
        int num = Integer.toString(b).length();//자릿수
        
        int op1 = a * (int)Math.pow(10,num)+b;
        int op2 = 2 * a * b;
        
        return (op1 >= op2)?op1:op2;
    }
}