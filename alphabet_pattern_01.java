import java.util.Scanner;
public class alphabet_pattern_01
{
  public static void Alphabet_Pattern_02(int order)
  {
    char ch='A';
  for(int i=1;i<=order;i++)
  {
    for(int j=1;j<=i;j++)
    {
      System.out.print(ch);
      ch++;
    }
    System.out.println(" ");
}
  }
  /* Output Alphabet_Pattern_02
  A
BC
DEF
GHIJ
KLMNO
PQRSTU
*/
  public static void Alphabet_Pattern_03(int order)
  {
    char ch='a';
  for(int i=1;i<=order;i++)
  {
    for(int j=1;j<=i;j++)
    {
      System.out.print(ch);
      ch++;
    }
    System.out.println(" ");
}
  }
  /* Output Alphabet_Pattern_03
  a
bc
def
ghij
klmno
pqrstu */

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
System.out.print("Enter the order : ");
    int order=sc.nextInt();
    System.out.println("\nHere Pattern for Capital letters :\n");
Alphabet_Pattern_02(order);
System.out.println("\nHere Pattern for small letters :\n");
Alphabet_Pattern_03(order);
  }
}
