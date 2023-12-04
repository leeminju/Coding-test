import java.util.*;

class Solution {
    public int solution(int N, int number) {
        if(N == number)
            return 1;
            
        HashSet<Integer>[] sets = new HashSet[9];
        for(int i=1;i<9;i++){
            sets[i] = new HashSet<>();
            if(i == 1){
                sets[1].add(N);// 1번 사용해서 만들 수 있는 수 -> N
                continue;
            }             
            sets[i].add(N * makeRepeatOneNum(i));// 11, 111, 111, 1111
            
            
            for(int j=1;j< i;j++){
                for(int num1 :sets[j]){
                    for(int num2 : sets[i-j]){
                        sets[i].add(num1 * num2);
                        if(num1 >= num2)
                            sets[i].add(num1 / num2);
                        if(num1 > num2)
                            sets[i].add(num1 - num2);
                        sets[i].add(num1 + num2);
                    }
                }
            }
    
            if(sets[i].contains(number)){
                return i;
            }
        
        }
    
        return -1;
    }
    
    int makeRepeatOneNum(int count){
        int num = 0;
        for(int i=0;i<count;i++){
            num += Math.pow(10,i);
        }
        return num;  
    }
}