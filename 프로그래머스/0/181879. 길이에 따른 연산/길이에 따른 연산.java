class Solution {
    public int solution(int[] num_list) {
        if(num_list.length >= 11){
            return 모든원소의합(num_list);
        }else{
            return 모든원소의곱(num_list);
        }
    }
    
    int 모든원소의합(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        return sum;
    }
    
    int 모든원소의곱(int[] array){
        int mul=1;
        for(int i=0;i<array.length;i++){
            mul *= array[i];
        }
        return mul;
    }
}