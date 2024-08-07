class Solution {
    public int solution(String myString, String pat) {
        String newStr="";
        
        for(int i=0;i<myString.length();i++){
            char c = myString.charAt(i);
            if(c=='A'){
                newStr += "B";
            }else if(c == 'B'){
                newStr += "A";
            }
        }
        
        if(newStr.contains(pat))
            return 1;
        
        return 0;
    }
}