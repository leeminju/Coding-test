class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String str = Integer.toString(order);
        
        for(int i=0;i<str.length();i++){
            char num = str.charAt(i);
            if(num == '3' || num == '6' || num == '9')
                answer++;
            
        }
        
        return answer;
    }
}