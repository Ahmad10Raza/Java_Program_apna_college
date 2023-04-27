import java.util.*;
public class Function_Parameters
{
  static void PrintHelow()
  {
    System.out.println("Helow_world!!");
  }
  public static void sum(int a, int b)
  {
    int sum=a+b;
    System.out.println("Sum is : "+sum);
  }
  public static void product(int a, int b)
  {
    int prod=(a*b);
    System.out.println("The product is :"+prod);
  }
  public static int factorial(int n3)
  {
    int fact=1;
    for(int i=1;i<=n3;i++)
    {
      fact=fact*i;
    }
    System.out.print("The factorial is :"+fact);
    return fact;

  }

  public static void main(String[] args) {
PrintHelow();
Scanner sc=new Scanner(System.in);
System.out.print("Enter the numbers: ");
int n1=sc.nextInt();
int n2=sc.nextInt();
sum(n1,n2);
product(n1,n2);
System.out.print("Do you want to find factorial of any numbers (Y/N): ");
char ch=sc.next().charAt(0);
if(ch=='Y' || ch=='y')
{
  System.out.print("Enter the numbers for factorial: ");
  int n3=sc.nextInt();
  factorial(n3);
}
else
{
  if(ch=='N' || ch=='n')
  {
    System.out.println("mat nikal factorial teri marji...");
  }
}
  }
}
