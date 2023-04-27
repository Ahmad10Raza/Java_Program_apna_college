import java.util.Scanner;
public class table
{
  public static void main(String[] args) {
    int num;
    Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
    num=sc.nextInt();
    System.out.println("The table of given number is...");

    for(int i=1;i<=10;i++)
    {
      System.out.println((num + " * " + i + " = " + num*i));

    }
  }
}
