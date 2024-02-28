import java.util.*;
class Solution {
    int answer = 0;
    boolean[] visited;
    Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        int length = numbers.length();
        
        // 1. 숫자를 조합한다
        for(int i=1;i<=length;i++){
            visited = new boolean[length];//초기화
            dfs(numbers,i,"");
        }
        
        // 2. 소수인지 판별한다.
        
        return answer;
    }
    
    void dfs(String numbers,int length,String str){
        if(str.length() == length){
            int num = Integer.parseInt(str);
            if(!set.contains(num)){
                set.add(num);
                if(isPrime(num)){
                    answer++;
                }
            }
            
            return;
        }
        
        for(int i=0;i<numbers.length();i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(numbers,length,str+numbers.charAt(i));
                visited[i] = false;
            }
        }
    }
    
    boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2;i<= Math.sqrt(num);i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
}