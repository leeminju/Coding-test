class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int remove = 0;
        
        while(!s.equals("1")){
            int c = countChar(s,'1');
            remove += s.length()-c;
            s =Integer.toString(c,2);
            count++;
        }
        
        answer[0]=count;
        answer[1]=remove;
        return answer;
    }
     
    public static int countChar(String str, char ch) {        
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
     }
}