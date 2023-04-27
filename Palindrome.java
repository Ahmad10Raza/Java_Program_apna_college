import java.util.Scanner;
public class Palindrome
{
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int num=sc.nextInt();
int rev=0;
int temp;
temp=num;
  while(num>0)
  {
    int lastDigit=num%10;
rev=(rev*10)+lastDigit;
num/=10;
  }
  if(rev==temp)
  {
  System.out.print("The number is palindrome :"+rev);
}
else
{
  System.out.println("The number is not palindrome :"+rev);
}
}
}
