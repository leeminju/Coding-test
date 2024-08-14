class Solution {
    public String solution(String bin1, String bin2) {
        int num1 = BinaryStringToDecimal(bin1);
        int num2 = BinaryStringToDecimal(bin2);
        int sum = num1 + num2;
        
        return Integer.toBinaryString(sum);
    }
    
    int BinaryStringToDecimal(String bin){
        int decimal = 0;
        int square = 0;
        for(int i=bin.length()-1;i>=0;i--){
            char c = bin.charAt(i);
            int n = c-'0';
            
            decimal += Math.pow(2,square++) * n;
        }
        return decimal;
    }
}