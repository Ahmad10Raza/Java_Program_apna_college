import java.util.*;
public class Rhombus_Pattern
{
  public  static void Rhombus_Pattern(int order)
  {
for(int i=1;i<=order;i++)
{
  for(int j=1;j<=order-i;j++)
  {
    System.out.print(" ");
}
for(int k=1;k<=order;k++)
{
  System.out.print("*");
}
System.out.println();
  }
}
public static void Hollow_Rhombus(int order)
{
  for(int i=1;i<=order;i++)
  {
  for(int j=1;j<=order-i;j++)
  {
    System.out.print(" ");
}
for(int k=1;k<=order;k++)
{
  if(i==1 || i==order || k==1 || k==order)
  {
    System.out.print("*");
  }
  else
  {
    System.out.print(" ");
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
    System.out.println("Here is Pattern of Solid RHOMBUS :......");
    Rhombus_Pattern(order);
    System.out.println("Here is Pattern of Hollow RHOMBUS:......");
    Hollow_Rhombus(order);

  }
}
