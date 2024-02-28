class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i=0;i<numbers.length;i++){
            
            if(numbers[i] % 4 != 3){
                answer[i] = numbers[i]+1;
            }else{
                String num = Long.toString(numbers[i],2);    
                //System.out.println(num);
            
                StringBuilder sb = new StringBuilder(num);
                int index = num.lastIndexOf("0");// 뒤에서 처음으로 0이 나오는 index
     
                //0이 없을 경우
                if(!num.contains("0")){
                    sb.insert(0,"0");//맨앞에 0 추가
                    index = 0;
                }
                
                System.out.println(index);
                
                //'01' - > '10'
                sb.setCharAt(index,'1');
                sb.setCharAt(index+1,'0');
                
               // System.out.println(sb.toString());
                //String(2진수)를 10진수로 변환
                answer[i]=Long.parseLong(sb.toString(), 2);
            }
            
        }
        
        return answer;
    }
}