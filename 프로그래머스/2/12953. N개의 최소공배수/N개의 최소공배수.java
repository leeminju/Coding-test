import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        //유클리드 호제법으로 최대공약수(GCD)를 구합니다.
        //두 수의 곱을 최대공약수로 나누면 최대공배수(LCM)을 구할 수 있습니다.
        //모든 수에 대해 순서대로 반복합니다.

        for(int i=0;i<arr.length-1;i++){
            int gcd = gcd(arr[i+1],arr[i]);
            int lcm = (arr[i+1] * arr[i])/ gcd;
            arr[i+1]=lcm;
            answer = lcm;
        }
        
        return answer;
    }
    
    int gcd(int a,int b){
        //a > b
        int r = a % b;
        return (r == 0) ? b : gcd(b,r);
    }
}