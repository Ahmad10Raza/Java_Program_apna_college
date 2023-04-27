import java.util.*;
public class Hollow_Rectangle_patterns
{
  public  static void Hollow_Rectangle(int row,int col)
  {
for(int i=1;i<=row;i++)
{
  for(int j=1;j<=col;j++)
  {
    if( i==1 || i==row || j==1 || j==col)
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
System.out.print("Enter the order of Hollow_Rectangle : ");
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int col=sc.nextInt();
Hollow_Rectangle(row,col);
  }
}
