// Java program to Demonstrate Working of HashSet Class 

// Importing required classes 
import java.util.*; 

// Main class 
// HashSetDemo 
class Iterator_On_HashMap { 

	// Main driver method 
	public static void main(String[] args) 
	{ 

		// Creating an empty HashSet 
		HashSet<String> h = new HashSet<String>(); 

		// Adding elements into HashSet 
		// using add() method 
		h.add("India"); 
		h.add("Australia"); 
		h.add("South Africa"); 

		// Adding duplicate elements 
		h.add("India"); 

		// Displaying the HashSet 
		System.out.println(h); 
		System.out.println("List contains India or not:"
						+ h.contains("India")); 

		// Removing items from HashSet 
		// using remove() method 
		h.remove("Australia"); 
		System.out.println("List after removing Australia:"
						+ h); 

		// Display message 
		System.out.println("Iterating over list:"); 

		// Iterating over hashSet items 
		Iterator<String> i = h.iterator(); 

		// Holds true till there is single element remaining 
		while (i.hasNext()) 

			// Iterating over elements 
			// using next() method 
			System.out.println(i.next()); 
	} 
}
