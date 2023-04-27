import java.util.*;
public class FLOYD_Inverted_Pattern
{
  public  static void Half_pyramid(int order)
  {
    int k=1;

for(int i=order;i>=1;i--)
{
  for(int j=1;j<=i;j++)
  {
System.out.print(k+" ");
k++;
}
System.out.println();
  }
}

  public static void main(String[] args)
  {
    System.out.print("Enter the order of Order of pyramid : ");
    Scanner sc=new Scanner(System.in);
    int order=sc.nextInt();
    Half_pyramid(order);

  }
}
