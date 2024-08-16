class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int rest_coupon = chicken%10;//남은 쿠폰
        int service = chicken/10;//받은 서비스 치킨 -> 쿠폰 발급
        answer += service;
        
        while(service + rest_coupon >= 10){
            int coupon = service + rest_coupon;
            service = coupon/10;
            rest_coupon = coupon%10;
            answer += service;
        }
        
        return answer;
    }
}