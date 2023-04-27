// Java program for the above approach
class Subarray_Sum_k {

	public static void main(String[] args)
	{
		int arr[] = { 10, 2, -2, -20, 10 };
		int k = -10;
		int n = arr.length;
		int res = 0;

		// calculate all subarrays
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				// calculate required sum
				sum += arr[j];
				// check if sum is equal to required sum
				if (sum == k)
					res++;
			}
		}
		System.out.println(res);
	}
}

// This code is contributed by Aditya Kumar (adityakumar129)
