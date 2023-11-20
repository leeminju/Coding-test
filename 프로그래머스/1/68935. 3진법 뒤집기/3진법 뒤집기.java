class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp=Integer.toString(n,3);
        String reverse = new StringBuilder(temp).reverse().toString();
        String[] array=reverse.split("");
        int cnt=0;
        
        for(int i=array.length-1;i>=0;i--){
            answer += Math.pow(3,cnt++) * Integer.parseInt(array[i]);
        }
        
        
        return answer;
    }
}