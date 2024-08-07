class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr2.length > arr1.length){
            return -1;
        }else if(arr2.length < arr1.length){
            return 1;
        }else{
            int sum1 = 모든원소의합(arr1);
            int sum2 = 모든원소의합(arr2);
        
            if(sum1 < sum2)
                return -1;
            else if(sum1 > sum2)
                return 1;
            else
                return 0;
        }
        
    }
    
    int 모든원소의합(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}