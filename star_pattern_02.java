import java.util.Scanner;
public class star_pattern_02
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of row: ");
    int num=sc.nextInt();
    for(int i=1;i<=num;i++)
    {
      for(int j=0;j<=num-i-1;j++)
      {
        System.out.print(" * ");
      }
      System.out.println(" ");
}
    }
  }
