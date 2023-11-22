import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        //String[] strs = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        
        String[] strs = new String[numbers.length];
        
        for(int i=0;i<strs.length;i++){
            strs[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(strs, new Comparator<String>(){            
            @Override
            public int compare(String o1, String o2){
                if(o1.length() == o2.length()){
                    return o2.compareTo(o1);
                }else{
                    return (o2+o1).compareTo(o1+o2);
                }
            }
        });
        
        answer = String.join("",strs);
 
        
         if(answer.charAt(0)=='0'){
            return "0";
        } 
        
        
        return answer;
    }
}