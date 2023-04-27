import java.util.Scanner;
public class print_numbers
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number for up to print: ");
    int num=sc.nextInt();
int i=1;
    while(i<=num)
    {
      System.out.print(" "+i);
      i++;
    }
  }
}
