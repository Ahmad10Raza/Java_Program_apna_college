import java.util.Scanner;
public class Binomial_Coefficient
{
  public static int factorial(int n3)
  {
    int fact=1;
    for(int i=1;i<=n3;i++)
    {
      fact=fact*i;
    }
    return fact;
  }
  public static void main(String[] args) {
    System.out.print("Enter the value of N(n) : ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print ("Enter the value of R(r) : ");
    int r=sc.nextInt();
    int n_fact=factorial(n);
    int r_fact=factorial(r);
    int n_r_fact=factorial(n-r);
  int Binomial_Coefficient=n_fact/(r_fact*n_r_fact);
  System.out.println("The Binomial_Coefficient is :"+Binomial_Coefficient);
  }
}
