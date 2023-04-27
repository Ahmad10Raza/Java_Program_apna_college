import java.util.*;
public class Diamond_Pattern
{
  public  static void Diamond_Pattern(int order)
  {
    //1st Half
for(int i=1;i<=order;i++)
{
  for(int j=1;j<=order-i;j++)
  {
System.out.print(" ");
}
for(int k=1;k<=(2*i-1);k++)
{
  System.out.print("*");
}
System.out.println();
}
//2nd Half
{
  //1st Half
for(int i=order;i>=1;i--)
{
for(int j=1;j<=order-i;j++)
{
System.out.print(" ");
}
for(int j=1;j<=(2*i-1);j++)
{
System.out.print("*");
}
System.out.println();
}
}
  }

  public static void main(String[] args)
   {
System.out.print("Enter the order of Diamond Pattern : ");
Scanner sc=new Scanner(System.in);
int order=sc.nextInt();
Diamond_Pattern(order);
  }
}
