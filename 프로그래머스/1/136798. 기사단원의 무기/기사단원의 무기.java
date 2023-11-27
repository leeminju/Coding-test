import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] array = new int[number+1];//0부터 number까지
        Arrays.fill(array,1);// 모두 1로 통일 (모두 1을 약수를 가지고 있기 때문에)        
    
        for(int i=2;i<=number;i++){
            for(int j=i;j<=number;j+=i){            
                array[j]++;
            }
        }
        
    
        for(int n=1;n<=number;n++){ 
            if(array[n] > limit){
                answer += power;
            }else{
                answer += array[n]; 
            }
        }
        
        return answer;
    }
    
}