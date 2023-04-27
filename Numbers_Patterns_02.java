import java.util.*;
public class Numbers_Patterns_02
{
  public  static void Numbers_Patterns_01(int order)
  {
for(int i=order;i>=1;i--)
{
  for(int j=1;j<=i;j++)
  {
System.out.print(j);
}
System.out.println();
}
}
/* Output Numbers_Patterns
123456789
12345678
1234567
123456
12345
1234
123
12
1

*/

public  static void Numbers_Patterns_02(int order)
{
for(int i=1;i<=order;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
}
/* Output of Numbers_Patterns_02
1
12
123
1234
12345
123456
*/

  static void Numbers_Patterns_03(int order)
{
for(int i=1;i<=order;i++)
{
  for(int k=1;k<=order-i;k++)
{
  System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
}
/* Output for Numbers_Patterns_03
     1
    12
   123
  1234
 12345
123456
1234567
*/
public  static void Numbers_Patterns_04(int order)
{
for(int i=1;i<=order;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
}
/*
Output for Numbers_Patterns_04 :
1
12
123
1234
12345
123456
1234567
12345678
*/

static void Numbers_Patterns_05(int order)
{
for(int i=1;i<=order;i++)
{
for(int k=1;k<=order-i-1;k++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{

System.out.print(j+" ");

}
System.out.println();
}
}

/*
Output for Numbers_Patterns_05 :
       1
      1 2
     1 2 3
    1 2 3 4
   1 2 3 4 5
  1 2 3 4 5 6
 1 2 3 4 5 6 7
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
*/

static void Numbers_Patterns_06(int order)
{
for(int i=order;i>=1;i--)
{
for(int k=1;k<=order-i-1;k++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{

System.out.print(j+" ");

}
System.out.println();
}
}
/*
Output for Numbers_Patterns_06 :
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7
 1 2 3 4 5 6
  1 2 3 4 5
   1 2 3 4
    1 2 3
     1 2
      1
      */

      static void Numbers_Patterns_07(int order)
      {
      for(int i=1;i<=order;i++)
      {
      for(int k=1;k<=order-i;k++)
      {
      System.out.print(" ");
      }
      for(int j=i;j>=1;j--)
      {

      System.out.print(j);

      }
      if(i==2)
      {
        for(int l=2;l<=order;l++)
        {
          System.out.print(l);
        }
System.out.println();
      }
      System.out.println();

      }

      }
/* not porduce exact Output */


public  static void Numbers_Patterns_08(int order)
{
for(int i=1;i<=order;i++)
{
for(int j=1;j<=order;j++)
{
  if((i+j)==6 || i==j)
  {
System.out.print(i);
}
else
{
  System.out.print(" ");
}
}
System.out.println();
}
}

/*
Output for Numbers_Patterns_08 :
1   1
 2 2
  3
 4 4
5   5
*/

   public static void main(String[] args)
  {
    System.out.print("Enter the order of Order of pyramid : ");
    Scanner sc=new Scanner(System.in);
    int order=sc.nextInt();
    System.out.println("Output Inverted: ");
    Numbers_Patterns_01(order);
    System.out.println("\nOutput :");
    Numbers_Patterns_02(order);
    System.out.println("\nOutput for Numbers_Patterns_03 :");
Numbers_Patterns_03(order);
System.out.println("\nOutput for Numbers_Patterns_04 :");
Numbers_Patterns_04(order);
System.out.println("\nOutput for Numbers_Patterns_05 :");
Numbers_Patterns_05(order);
System.out.println("\nOutput for Numbers_Patterns_06 :");
Numbers_Patterns_06(order);
//System.out.println("\nOutput for Numbers_Patterns_07 :");
//Numbers_Patterns_07(order);
System.out.println("\nOutput for Numbers_Patterns_08 :");
Numbers_Patterns_08(order);

  }
}
