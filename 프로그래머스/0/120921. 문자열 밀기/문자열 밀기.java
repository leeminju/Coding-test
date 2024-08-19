class Solution {
    public int solution(String A, String B) {
        int count = 1;
        
        if(A.equals(B))
            return 0;
        
        while(count < A.length()){
            String temp = "";
                    
            temp += A.charAt(A.length()-1);

            temp += A.substring(0,A.length()-1);
            
            if(temp.equals(B)){
                return count;
            }
            
            A = temp;
            count++;
        }
        
        return -1;
    }
}