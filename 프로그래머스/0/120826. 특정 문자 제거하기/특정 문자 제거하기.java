class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder(my_string);
        int length = letter.length();
        int index = sb.indexOf(letter);
        
        while(index != -1){
            sb.delete(index,index+length);
            index =sb.indexOf(letter);
        }
      
        
        return sb.toString();
    }
}