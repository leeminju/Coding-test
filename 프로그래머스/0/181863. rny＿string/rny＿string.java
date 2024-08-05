class Solution {
    public String solution(String rny_string) {
        StringBuilder sb = new StringBuilder(rny_string);
        int idx = sb.indexOf("m");
        while(idx != -1){
            sb.replace(idx,idx+1,"rn");
            idx = sb.indexOf("m");
        }
        
        return sb.toString();
    }
}