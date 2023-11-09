import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = ""+n;
        char[] chararr= str.toCharArray();
        String temp = "";
        
        Arrays.sort(chararr);
        
        for(int i=chararr.length-1;i>=0;i--){
            temp += chararr[i];
        }
        
        return Long.parseLong(temp);
    }
}