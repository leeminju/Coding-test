class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        
        for(int num:num_list){
            mul *= num;
            sum += num;
        }
        
        if(mul < Math.pow(sum,2))
            return 1;
        
        return 0;
    }
}