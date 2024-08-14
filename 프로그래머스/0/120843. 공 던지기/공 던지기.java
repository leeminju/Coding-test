class Solution {
    public int solution(int[] numbers, int k) {
        int count = 0;
        int index = 0;
        
        while(count<k){
            count++;
            if(count == k){
                return numbers[index];
            }
            
            //공던지기
            if(index+2 < numbers.length){
                index += 2;
            }else{
                index = index+2 - numbers.length;
            }
        }
        
        return 0;
    }
}