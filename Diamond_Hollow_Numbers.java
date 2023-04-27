import java.util.*;
public class Diamond_Hollow_Numbers
{
  public  static void Numbers_Patterns_01(int order)
  {
  for(int i=1;i<=order;i++)
  {
  for(int j=1;j<=i;j++)
  {
  System.out.print(j);
  }
  System.out.println();
  }

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

    /* Output for Numbers_Patterns_03
         1
        12
       123
      1234
     12345
    123456
    1234567
    */

  }
  /* Output of Numbers_Patterns_02
  1
  12
  123
  1234
  12345
  123456
  */
  public  static void Numbers_Patterns_02(int order)
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

  public  static void Numbers_Patterns_03(int order)
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





   public static void main(String[] args)
  {
    System.out.print("Enter the order of Order of pyramid : ");
    Scanner sc=new Scanner(System.in);
    int order=sc.nextInt();
    Numbers_Patterns_01(order);

  }
}
