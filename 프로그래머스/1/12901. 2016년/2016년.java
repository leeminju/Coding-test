class Solution {
    public String solution(int a, int b) {
        //2월 29일 존재함!
        int sum = 0;
        
        String[] dayOfWeek = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] day = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        
        for(int i=0;i< a;i++){
            sum += day[i];
        }
        int q = (sum+b-1)%7;
        
        return dayOfWeek[q];
        
    }
}