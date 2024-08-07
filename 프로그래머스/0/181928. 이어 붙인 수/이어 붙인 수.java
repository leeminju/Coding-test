class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        
        for(int num:num_list){
            String n = Integer.toString(num);
            if(num % 2==1){
                odd += n;
            }else{
                even += n;
            }
        }
        
        
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}