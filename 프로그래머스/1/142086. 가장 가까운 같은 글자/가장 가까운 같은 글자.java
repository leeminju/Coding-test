class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] chars = s.toCharArray();
        
        answer[0]=-1;
        for(int i=1;i<s.length();i++){
            // 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 같은 글자
            if(s.substring(0,i).contains(Character.toString(chars[i]))){
                
                for(int j=i-1 ; j>=0 ; j--){
                    if(chars[i]  == chars[j]){
                        answer[i] = i - j; 
                        break;
                    }
                }
            }else{
                answer[i]=-1;
            }
        }
        
        return answer;
    }
}