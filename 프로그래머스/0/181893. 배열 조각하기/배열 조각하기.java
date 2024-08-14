import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        for(int i=0;i<query.length;i++){
            if(i%2==0){
            //짝수 - 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
            //배열의 처음(0)부터 query[i]까지 
                arr=Arrays.copyOfRange(arr, 0, query[i]+1);
            }else{
             //홀수 -query[i]번 인덱스 앞부분을 잘라서 버립니다.
             //query[i]번 부터 끝까지
                arr=Arrays.copyOfRange(arr,query[i], arr.length);
            }
        }
        
        return arr;
    }
}