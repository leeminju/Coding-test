
import java.util.*;

class Solution {
	public int solution(int[][] jobs) {
		int answer = 0;
		int current_time = 0;// 현재 시간
	
		int count = 0;// 완료한 작업 수
		int idx = 0;

		// 원본 배열 오름차순 정렬 (요청시간 오름차순)
		Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

		// 소요 시간 오름차순으로 정렬되는 우선순위 큐(Heap)
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

		// 요청이 모두 수행될 때까지 반복
		while (count < jobs.length) {
			// 현재 시간까지 들어온 모든 요청을 큐에 넣음
			while (idx < jobs.length && jobs[idx][0] <= current_time)
				pq.add(jobs[idx++]);
            
            if(pq.isEmpty()){
                //현재 시간에 들어온 요청이 없으면
                current_time = jobs[idx][0];//다음 요청 시간으로 건너뜀 
            }else{
                int[] job = pq.poll();//소요 시간이 빠른 작업 먼저 실행 
                count++;//완료한 작업 수 증가
                
                current_time += job[1];//현재 시간에 작업 소요 시간 더하기 (종료 시간)
                answer +=  current_time - job[0];//요청 시간~종료 까지 걸리는 시간                 
            }
        
        }
                 
        answer /= jobs.length;
        
        return answer;
    }
}
