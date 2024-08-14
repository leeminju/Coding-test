class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = sides[0];
        int b=  sides[1];
        
        if(a>=b){
            //1.가장 긴변이 a
            // b + c > a
            // c > a -b
            //2. 가장 긴변이 나머지
            // a + b > c
            answer = a+b - (a-b) -1;
            
        }else if(a<b){
            //1.가장 긴변이 b
            // a + c > b
            // c > b - a
            //2.가장 긴변이 나머지
            //a + b > c 
            
            answer = a+b - (b-a) -1;
        }
        
        return answer;
    }
}