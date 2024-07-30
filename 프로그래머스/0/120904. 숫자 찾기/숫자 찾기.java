class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if((int) c - '0' == k ){
                return i+1;
            }
        }
        
        return -1;
    }
}