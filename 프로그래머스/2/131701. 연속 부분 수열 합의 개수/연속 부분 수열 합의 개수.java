import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int len = elements.length;
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>(); 
        
        for(int i=0;i<len;i++){
            set.add(elements[i]);
            queue.offer(elements[i]);
        }
        
        System.out.println(set.toString());
        for(int size=2;size<len;size++){
            int count = 0;
            int sum = 0;
            int[] array = new int[size];
            
            for(int i=0;i<len+size-1;i++){
                int temp = queue.poll();
                array[count] = temp;    
                sum += temp;
                count++;
                if(count == size){
                    set.add(sum);
                    count = size-1;
                    sum -= array[0];
                    
                    for(int j=1;j<size;j++){
                        array[j-1] = array[j];
                    }
                }
                queue.offer(temp);
            }

            
        }
            
        
        return set.size() + 1;
    }
}