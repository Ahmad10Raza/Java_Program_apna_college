import java.util.Scanner;
public class positive_negative
{
  public static void main(String[] args) {
    int num;
    Scanner in=new Scanner(System.in);
System.out.println("Enter the Numbers: ");
    num=in.nextInt();
    if(num>=0)
    {
      System.out.print("Nuber is positve: "+num);
    }
    else
    {
      System.out.println("Number is negative: "+num);
    }
  }
}
