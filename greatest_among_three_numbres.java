import java.util.*;
public class greatest_among_three_numbers{
  public static void main(String[] args) {
    System.out.print("Enter thre numbers one by one : ");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
System.out.println("Entered numbers is : "+ a ","+ b","+c);
int big;
 big=(a>b)?((a>c)?(a:c)):((b<c)?b:c));
System.out.println("greatest_among_three_numbers is :"+big);
  }
}
