class Solution {
    public int solution(String my_string, String is_suffix) {
        for(int i=my_string.length()-1;i>=0;i--){
            String suffix = my_string.substring(i,my_string.length());
            
            if(suffix.equals(is_suffix)){
                return 1;
            }
        }
        
        return 0;
    }
}