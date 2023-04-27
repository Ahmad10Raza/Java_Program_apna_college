import java.util.Scanner;

// import java.io.*;
// import java.math.*;
// import java.util.*;
class Tower_Of_Hanoi {
	static void TowerOfHanoi(int n, char source,char destination, char aux)
	{
		if (n == 0) {
			return;
		}
		TowerOfHanoi(n - 1, source, aux, destination);
		System.out.println("Move disk " + n + " from rod "+ source + " to rod "+ destination);
		TowerOfHanoi(n - 1, aux, destination, source);
	}

	// Driver code
	public static void main(String args[])
	{
		// int N = 3;
     Scanner IND=new Scanner(System.in);
     System.out.println("Enter the number of plates: ");
    int n=IND.nextInt();
		// A, B and C are names of rods
		TowerOfHanoi(n, 'A', 'C', 'B');
	}
}
