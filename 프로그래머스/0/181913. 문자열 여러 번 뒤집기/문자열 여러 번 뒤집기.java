class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            String temp = my_string.substring(0,s);
            
            String str = my_string.substring(s,e+1);
            StringBuilder sb = new StringBuilder(str);  
            temp += sb.reverse().toString();
            
            temp += my_string.substring(e+1);
                
            my_string = temp;
        }
        
        return my_string;
    }
}