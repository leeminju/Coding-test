class Solution {
    public int solution(String A, String B) {
        int count = 1;
        
        if(A.equals(B))
            return 0;
        
        while(count < A.length()){
            String temp = "";
                    
            temp += A.charAt(A.length()-1);

            for(int i=0;i<A.length()-1;i++){
                char c= A.charAt(i);
                temp += c;
            }
            
            if(temp.equals(B)){
                return count;
            }
            System.out.println(count+" "+temp);
            A = temp;
            count++;
        }
        
        return -1;
    }
}