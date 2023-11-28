import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;// 1은 약수의 개수가 1
        
        int[] array = new int[number+1];//0부터 number까지
        Arrays.fill(array,1);// 모두 1로 통일 (모두 1을 약수를 가지고 있기 때문에)                
        
        //에라토스테네스의 체와 비슷한 방식
        for(int i=2;i<=number;i++){
            for(int j=i;j<=number;j+=i){            
                array[j]++;
            }
            
            if(array[i] > limit){
                answer += power;
            }else{
                answer += array[i]; 
            }
        }
        
        
        return answer;
    }
    
}