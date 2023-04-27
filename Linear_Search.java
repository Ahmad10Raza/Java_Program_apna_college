import java.util.*;
public class Linear_Search{
public static int linearSearch(int[] arr, int key)
{
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String a[]){
        int[] a1= {10,20,30,50,70,90};
        int key = 50;
        System.out.println(key+" is found at index: "+linearSearch(a1, key));
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
int[] a2= new int[n];
 System.out.print("Enter the elements:..");
 for (int i=0;i<n ;i++ )
  {
   a2[i]=sc.nextInt();
 }
 System.out.print("Enter the key for new created list:");
 int key2=sc.nextInt();
 System.out.println(key+" is found at index: "+linearSearch(a2, key2));


    }
}
