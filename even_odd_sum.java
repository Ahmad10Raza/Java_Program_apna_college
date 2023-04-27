import java.util.Scanner;
public class even_odd_sum
{
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
System.out.print("Enter the numbers: ");
int num=sc.nextInt();
int even_sum=0,odd_sum=0;
for (int i=1;num<=0 ;i++ )
{
  if(num%2==0)
  {
    even_sum+=num;
  }
  else
  {
    odd_sum+=num;
  }
  }
  System.out.println("Even Sum is :"+ even_sum);
  System.out.println("Odd Sum is :"+ odd_sum);
}
}
