import java.util.Scanner;
public class area_of_circle
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the redius: ");
    int a=in.nextInt();
    double area=3.14f*a*a;
    System.out.println(area);
  }
}
