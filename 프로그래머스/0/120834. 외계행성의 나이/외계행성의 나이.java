class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        
        while(age > 0){
            int num = age % 10;
            age /= 10;
            char c =(char)('a' + num);
            answer.insert(0,c);
        }

        return answer.toString();
    }
}