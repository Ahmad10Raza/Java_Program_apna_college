import java.util.*;
public class Binary_Triangle
{
  public  static void Binary_Triangle(int order)
  {
for(int i=1;i<=order;i++)
{
  for(int j=1;j<=i;j++)
  {
    if((i+j)%2==0)
    {
System.out.print("1");
}
else
{
  System.out.print("0");
}
}
System.out.println();
  }
}

  public static void main(String[] args)
  {
    System.out.print("Enter the order of Order of pyramid : ");
    Scanner sc=new Scanner(System.in);
    int order=sc.nextInt();
    Binary_Triangle(order);

  }
}
