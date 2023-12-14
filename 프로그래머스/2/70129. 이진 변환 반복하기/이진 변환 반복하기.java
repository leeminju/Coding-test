class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        long remove = 0;
        
        while(!s.equals("1")){
            remove += countChar(s,'0');
            long c = countChar(s,'1');
            s =Long.toString(c,2);
            count++;
        }
        
        answer[0]=count;
        answer[1]=(int)remove;
        return answer;
    }
     
    public static long countChar(String str, char ch) {        
         return str.chars()                
             .filter(c -> c == ch)                
             .count();    
     }
}