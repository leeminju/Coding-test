class Solution {
    public String solution(int a, int b) {
        //2월 29일 존재함!
        int sum = 0;
        
        String[] dayOfWeek = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        //1월 7일 목요일 7%7 = 0 0번째 인덱스
        //1월 1일 금요일 7%1 = 1 1번째 인덱스
        int[] day = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        
        for(int i=0;i< a;i++){
            sum += day[i];
        }
        int q = (sum+b)%7;
        
        return dayOfWeek[q];
        
    }
}