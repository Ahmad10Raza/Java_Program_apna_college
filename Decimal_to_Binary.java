import java.util.*;
public class Decimal_to_Binary
{
public static void Binary(int Dec_Num)
{
  int pow=0;
  int Bin_Num=0;
  while(Dec_Num>0)
  {
    int rem=Dec_Num%2;
    Bin_Num=Bin_Num+(rem*(int)Math.pow(10,pow));
    pow++;
    Dec_Num/=10;
  }
System.out.print("The Binary is  ="+ Bin_Num);
  }
  public static void main(String[] args) {
System.out.print("Enter the decimal numbers : ");
Scanner sc=new Scanner(System.in);
int Dec_Num=sc.nextInt();
Binary(Dec_Num);

  }
}
