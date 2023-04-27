
import java.util.*;
public class Array_Basic{
 static void Array_Basic_01()
 {
   // declares an Array of integers.
   int[] arr;

   // allocating memory for 5 integers.
   arr = new int[5];

   // initialize the first elements of the array
   arr[0] = 10;

   // initialize the second elements of the array
   arr[1] = 20;

   // so on...
   arr[2] = 30;
   arr[3] = 40;
   arr[4] = 50;

   // accessing the elements of the specified array
   for (int i = 0; i < arr.length; i++)
     System.out.println("Element at index " + i+ " : " + arr[i]);

 }
 static void Array_Basic_02(int numbers[])
 {

   System.out.println("Element are......");
   for (i=0;i>n ;i++ )
    {
System.out.println("Element at index " + i+ " : " + numbers[i]);
   }
 }


	public static void main(String[] args)
	{
Array_Basic_01();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array: ");
int n=sc.nextInt();
int numbers[]=new int[20];
System.out.println("Enter the numbers for from Array: ");

for (i=0;i<n ;i++ )
{
numbers[i]=sc.nextInt();
}
Array_Basic_02(numbers[]);
      }
}
