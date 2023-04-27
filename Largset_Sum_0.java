// Java code for the above approach

class Largest_Sum_0 {

	// Returns length of the largest subarray
	// with 0 sum
	static int maxLen(int arr[], int N)
	{
		int max_len = 0;

		// Pick a starting point
		for (int i = 0; i < N; i++) {
		
			// Initialize curr_sum for every
			// starting point
			int curr_sum = 0;

			// try all subarrays starting with 'i'
			for (int j = i; j < N; j++) {
				curr_sum += arr[j];

				// If curr_sum becomes 0, then update
				// max_len
				if (curr_sum == 0)
					max_len = Math.max(max_len, j - i + 1);
			}
		}
		return max_len;
	}

// Driver's code
	public static void main(String args[])
	{
		int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
		int N = arr.length;	
	// Function call
		System.out.println("Length of the longest 0 sum "+ "subarray is " + maxLen(arr, N));
	}
}
