class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        char c1=sb.charAt(num1);
        char c2=sb.charAt(num2);
        
        System.out.println(c1 + " "+c2);
        
        sb.replace(num1,num1+1,Character.toString(c2));
        sb.replace(num2,num2+1,Character.toString(c1));
        
        return sb.toString();
    }
}