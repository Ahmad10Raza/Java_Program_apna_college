import java.util.*;
public class Binary_to_Decimal
{
public static void Binary(int Bin_Num)
{
  int pow=0;
  int Dec_Num=0;
  while(Bin_Num>0)
  {
    int lastDigit=Bin_Num%10;
    Dec_Num=Dec_Num+(lastDigit*(int)Math.pow(2,pow));
    pow++;
    Bin_Num/=10;
  }
System.out.print("The decimal is ="+ Dec_Num);
  }
  public static void main(String[] args) {
System.out.print("Enter the binary numbers : ");
Scanner sc=new Scanner(System.in);
int Bin_Num=sc.nextInt();
Binary(Bin_Num);
  }
}
