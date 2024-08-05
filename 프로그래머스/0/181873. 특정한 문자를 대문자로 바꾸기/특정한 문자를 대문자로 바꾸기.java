class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder(my_string);
        
        String upper = alp.toUpperCase();
        int idx = sb.indexOf(alp);
        
        while(idx != -1){
            sb.replace(idx,idx+1,upper);
            idx = sb.indexOf(alp);
        }
        
        return sb.toString();
    }
}