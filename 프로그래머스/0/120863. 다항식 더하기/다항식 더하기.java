class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int coefficient =0;
        int constant =0;
        String[] opr = polynomial.split(" ");
        
        for(String num : opr){
            if(num.contains("x")){
                //x항
                if(num.length() == 1){
                    coefficient += 1;
                }else{
                    num = num.substring(0,num.length()-1);
                    coefficient += Integer.parseInt(num);
                }
            }else if(!num.equals("+")){
                //상수항
                constant += Integer.parseInt(num);
            }
        }
        
        System.out.println(coefficient +" " + constant);
        
        if(constant == 0){
            if(coefficient  == 1){
                return "x";
            }
            return coefficient+"x";
        }else if(coefficient == 0){
            return Integer.toString(constant);
        }else{
            if(coefficient  == 1){
                return "x + "+constant;
            }
            return coefficient+"x + "+constant;   
        }
    }
}