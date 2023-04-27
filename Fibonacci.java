import java.util.Scanner;
public class Fibonacci
{
  public static void main(String[] args) {
    int prev=0,next=1,f=1,i,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number : ");
    n=sc.nextInt();
    System.out.println("The Fibonacci series of given number are :...");
    System.out.print(f);
    for(i=1;i<=n;i++)
    {
      f=prev+next;
      prev=next;
      next=f;
      System.out.print(","+f);
    }
  }
}
