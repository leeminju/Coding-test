class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder(my_string);
        int length = letter.length();
        
        for(int i=0;i+length < my_string.length()+1;i++){
            String sub = my_string.substring(i,i+length);
            
            if(sub.equals(letter)){
                int index =sb.indexOf(letter);
                sb.delete(index,index+length);
            }
        }
        
        return sb.toString();
    }
}