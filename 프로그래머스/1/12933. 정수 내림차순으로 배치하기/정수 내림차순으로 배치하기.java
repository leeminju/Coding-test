import java.util.*;
class Solution {
	public long solution(long n) {
		long answer = 0;
		int[] arr;
		ArrayList<Integer> list = new ArrayList<>();
		int idx = 0;
		int a = 0;

		while (n / 10 >= 0) {
			long q = n / (long) 10;
			long r = n % (long) 10;
			list.add((int) r);

			idx++;
			n = q;

			if (q == 0)
				break;
		}
		arr = new int[idx];
		for (int i = 0; i < idx; i++)
			arr[i] = list.get(i);

		Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);

		Arrays.sort(array, Collections.reverseOrder());

		for (int i = array.length - 1; i >= 0; i--) {
			answer += (long) Math.pow(10, a++) * array[i];
		}

		System.out.println(answer);

		return answer;
	}
}

