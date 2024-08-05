class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[names.length/5 + ((names.length%5 == 0)?0:1)];
        int idx=0;
        
        for(int i=0;i<answer.length;i++){
            answer[i] = names[idx];
            idx += 5;
        }
        
        return answer;
    }
}