class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i=0;i<numbers.length;i++){
            
            if(numbers[i] % 4 != 3){
                answer[i] = numbers[i]+1;
            }else{
                answer[i]=function(numbers[i]);
            }
            
        }
        
        return answer;
    }
    
    
    long function(long number){
        String num = Long.toString(number,2);    
            
        StringBuilder sb = new StringBuilder(num);
        int index = num.lastIndexOf("0");// 뒤에서 처음으로 0이 나오는 index
     
        //0이 없을 경우
        if(index == -1){
            sb.insert(0,"1");//맨앞에 1 추가
            sb.setCharAt(1,'0');
        }else{
            //'01' - > '10'
            sb.setCharAt(index,'1');
            sb.setCharAt(index+1,'0');
        }
                    
        return Long.parseLong(sb.toString(), 2);
    }
}