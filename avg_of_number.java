import java.util.Scanner;
public class avg_of_number
{
public static void main(String[] args) {
  int A,B,C;
  Scanner in = new Scanner(System.in);
  A=in.nextInt();
  B=in.nextInt();
  C=in.nextInt();
  float avg=((A+B+C)/3);
  System.out.println("The Average of three number is :"+avg);
}
}
