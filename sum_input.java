import java.util.Scanner;
public class sum_input
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the two numbers:");
    int a=in.nextInt();
    int b=in.nextInt();
    int sum;
    sum=a+b;
    System.out.println(sum);
  }
}
