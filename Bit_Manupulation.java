import java.util.*;
public class  Bit_Manupulation
{
  public static void Bitwise_AND()
  {
    Scanner IND=new Scanner(System.in);
    System.out.print("Enter two Numbers (a & b): ");
    int n1=IND.nextInt();
    int n2=IND.nextInt();
System.out.println("Answer is "+(n1&n2));
  }
  public static void Bitwise_OR()
  {
    Scanner IND=new Scanner(System.in);
    System.out.print("Enter two Numbers (a | b): ");
    int n1=IND.nextInt();
    int n2=IND.nextInt();
System.out.println("Answer is "+(n1|n2));
  }
  public static void Binary_XOR()
  {
    Scanner IND=new Scanner(System.in);
    System.out.print("Enter two Numbers (a ^ b): ");
    int n1=IND.nextInt();
    int n2=IND.nextInt();
System.out.print("Answer is "+(n1^n2));
  }
  public static void Binary_One_Complement()
  {
    Scanner IND=new Scanner(System.in);
    System.out.print("Enter two Numbers ( ~a ): ");
    int n1=IND.nextInt();
System.out.print("Answer is "+(~n1));
  }
  public static void Binary_Left_and_Right_Shift()
  {
    Scanner IND=new Scanner(System.in);
    System.out.print("Enter two Numbers (a & b): ");
    int n1=IND.nextInt();
    int n2=IND.nextInt();
System.out.println("After Left Shift Answer is "+(float)(n1<<n2));
System.out.print("After Right Shift Answer is "+(float)(n1>>n2));
  }
  public static void Odd_Even()
  {
    Scanner IND=new Scanner(System.in);
    System.out.print("Enter Numbers : ");
    int n1=IND.nextInt();
int bitmask=1;
if((n1&bitmask)==0)
{
  System.out.println("Even");
}
else
{
  System.out.print("Odd");
}
  }
  public static void Get_in_Bit()//what is value at Index
  {
    Scanner IND=new Scanner(System.in);
    System.out.print("Enter Binary Numbers : ");
    int n1=IND.nextInt();
    System.out.print("Enter Index : ");
    int n2=IND.nextInt();
int bitmask=1<<n2;
int R=((n1&bitmask)==0)?0:1;
System.out.print("The value is :"+R);
  }
  public static void Set_ith_Bit()//what is value at Index
  {
    Scanner IND=new Scanner(System.in);
    System.out.print("Enter  Numbers : ");
    int n1=IND.nextInt();
    System.out.print("Enter Index : ");
    int n2=IND.nextInt();
int bitmask=1<<n2;
int R=(n1|bitmask);
System.out.print("The value is :"+R);
  }

  public static void main(String[] args)
   {
//Bitwise_AND();
//Bitwise_OR();
//Binary_XOR();
//Binary_One_Complement();
//Binary_Left_and_Right_Shift();
//Odd_Even();
//Get_in_Bit();
Set_ith_Bit();
  }
}
