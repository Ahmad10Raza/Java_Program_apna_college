import java.util.Scanner;
public class reverse_of_given_numbers
{
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int num=sc.nextInt();
int rev=0;
  while(num>0)
  {
    int lastDigit=num%10;
rev=(rev*10)+lastDigit;
num/=10;
  }
  System.out.print("The reverse_of_number is : "+rev);
}
}
