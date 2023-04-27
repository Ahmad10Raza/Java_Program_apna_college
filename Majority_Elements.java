import java.util.*;
class Majority_Elements {

	// Function to find Majority element
	// in an array
	static void findMajority(int arr[], int n)
	{
		int maxCount = 0;
		int index = -1; // sentinels
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}

			// update maxCount if count of
			// current element is greater
			if (count > maxCount) {
				maxCount = count;
				index = i;
			}
		}

		// if maxCount is greater than n/2
		// return the corresponding element
		if (maxCount > n / 2)
			System.out.println(arr[index]);

		else
			System.out.println("No Majority Element");
	}


    private static void findMajority_Hashmap(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
 
        for(int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                    int count = map.get(arr[i]) +1;
                    if (count > arr.length /2) {
                        System.out.println("Majority found :- " + arr[i]);
                        return;
                    } else
                        map.put(arr[i], count);
 
            }
            else
                map.put(arr[i],1);
            }
            System.out.println(" No Majority element");
    }
	// Driver code
	public static void main(String[] args)
	{

		int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
		int n = arr.length;

		// Function calling
		findMajority(arr, n);
        findMajority_Hashmap(arr);
	}
	
}
