import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] ranks = new int[score.length];
        //학생들의 평균 점수를 담은 배열
        Double[] average = new Double[score.length];
        Map<Double,Integer> map = new HashMap<>();//점수 , 등수
        
        for(int i=0;i<score.length;i++){
            //영어점수와 수학점수의 평균 계산해 저장
            average[i] = (double)(score[i][0]+score[i][1])/2;
        }
        
        //폄균점수를 내림차순으로 정렬하기 위한 배열 생성 
        Double[] sorted_average = average.clone();//복사
        
        //평균점수 내림차순으로 정렬 
        Arrays.sort(sorted_average,Collections.reverseOrder());
        int rank = 1;
        
        //각 평균점수에 해당하는 등수 저장
        for(int i=0;i<sorted_average.length;i++){
            //같은 점수는 같은 등수로 처리
            if(!map.containsKey(sorted_average[i])){
                map.put(sorted_average[i],rank);
            }
            rank++;
        }
        
        //원래의 순서에 해당하는 평균점수를 순회하면서 몇 등에 해당하는지 확인 후 ranks 저장
        for(int i=0;i<average.length;i++){
            ranks[i] = map.get(average[i]);
        }
        
        return ranks;
    }
}