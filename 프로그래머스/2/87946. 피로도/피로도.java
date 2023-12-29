import java.util.*;
class Solution {
    List<int[][]> result = new ArrayList<>();
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        int N = dungeons.length;
        
        permutation(dungeons,0,N);
        for(int[][] res:result){
            int cur = k;
            int count = 0;
            for(int[] dungeon : res){
                if(cur >= dungeon[0]){
                    count++;
                    cur -= dungeon[1];
                }else{
                    break;
                }
            }
            
            answer = Math.max(answer,count);
            
        }
        
            
        return answer;
    }
    
    void permutation(int[][] arr, int depth, int n) {
        if (depth == n) {
            result.add(arr.clone());
            return;
        }
    
     
        for (int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n);
            swap(arr, depth, i);
        }
    }
    
    void swap(int[][] arr, int depth, int i) {
        int[] temp = arr[depth].clone();
        arr[depth] = arr[i].clone();
        arr[i] = temp.clone();
    }
    
    //https://bcp0109.tistory.com/14
}