import java.util.*;
public class Avg_Of_Numbers_Function
{
public static void Avg(int n1,int n2,int n3)
{
  int avg;
avg=(n1+n2+n3)/3;
System.out.println("The Avg_Of_Numbers :"+avg);

}
public static void main(String[] args) {
  System.out.println("Enter the three numbers: ");
  Scanner sc=new Scanner(System.in);

  int  n1=sc.nextInt();
    int n2=sc.nextInt();
    int n3=sc.nextInt();
Avg(n1,n2,n3);
}
}
