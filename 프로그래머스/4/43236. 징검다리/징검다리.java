import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        int len = rocks.length;
        Arrays.sort(rocks);//정렬
        int[] dif = new int[len + 1];
        
        dif[0] = rocks[0]; 
        for(int i=1;i<len;i++){
            dif[i] = rocks[i] - rocks[i-1];
        }
        dif[len] = distance - rocks[len-1];
        
        // 바위 사이 간격의 최대값 최소값
		int low = 1;
		int high = distance;
        int mid =(low + high) / 2;
         System.out.println(mid);
        while (low <= high) {
			// 바위 사이의 간격 중 제일 작은 값이 mid가 되려면 몇 개의 바위를 제거해야 하는가
			int remove = 0;
			int cur = 0;
			
			for (int i = 0; i < dif.length; i++) {
				cur += dif[i];
				if (cur < mid)
					remove++;
				else
					cur = 0;
			}
			if (remove > n) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

			mid = (low + high) / 2;

		}

		return mid;
	}   
}