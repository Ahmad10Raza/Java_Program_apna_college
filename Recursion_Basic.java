import java.util.*;
public class Recursion_Basic
{
  public static void PrintDec_Rev(int n)
  {

    if(n==1)
    {
      System.out.println(1);
      return;
    }
    System.out.print(n+" ");
PrintDec_Rev(n-1);
  }

  public static void PrintInc(int n)
  {
    if(n==1)
    {
      System.out.print(1);
      return;
    }
    PrintDec_Rev(n-1);
    System.out.print(n+" ");
  }

  public static int Factorial(int num)
  {
    if(num==1)
    {
      return 1;
    }
int a=Factorial(num-1);
int b=num *Factorial(num-1);
return b;
      }
  public static int Calc_Sum(int num2)
  {
    if(num2==0)
    {
      return 1;
    }
int a=Calc_Sum(num2-1);
int b=num2 +a;
return b;
      }
  public static int Fibonacci(int num3)
  {
    if(num3==0 || num3  ==1)
    {
      return 1;
    }
int a=Fibonacci(num3-1);
int b=Fibonacci(num3-2);
int c= a+b;
return c;
      }


  public static void main(String[] args)
  {
    Scanner IND=new Scanner(System.in);
/*
    System.out.print("Enetr the numbers: ");
    int n=IND.nextInt();
    System.out.println("Numbers in Reverse order is : ");
PrintDec_Rev(n);
System.out.println("Numbers in Increasing order is : ");
PrintInc(n);
System.out.print("Enter numbers for Factorial: ");
int num=IND.nextInt();
Factorial(num);
System.out.print("Factorial is "+Factorial(num));
System.out.print("Enter numbers:");
int num2=IND.nextInt();
System.out.print("Sum is "+Calc_Sum(num2));
*/
System.out.print("Enter numbers:");
int num3=IND.nextInt();
System.out.print("Fibonacci is "+Fibonacci(num3));
}
}
