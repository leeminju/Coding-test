import java.util.*;

class Solution {
	public long solution(long n) {
		long answer = 0;
		long[] arr;
		ArrayList<Long> list = new ArrayList<>();
		int idx = 0;

		while (n > 0) {
			long r = n % 10;
			list.add(r);
			idx++;
			n /= 10;
		}
        
		arr = new long[idx];
    
		long[] array = list.stream().mapToLong(i->i).toArray();

		Arrays.sort(array);
        idx--;

		for (int i = array.length - 1; i >= 0; i--) {
			answer += (long) Math.pow(10, idx--) * array[i];
		}

		return answer;
	}
}

