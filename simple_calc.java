import java.util.Scanner;
public class simple_calc
{
  public static void main(String[] args) {
    System.out.println("What do want : 1). +\n 2.) -\n 3. *\n 4. /\n 5.) %");
    Scanner sc=new Scanner(System.in);
char op=sc.next().charAt(0);
System.out.print("Enter the two operand :");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    sc.close();
    switch (op)
     {
      case '+':
      {
        System.out.println("sum is :"+ (num1+num2));
        break;
      }
      case '-':
      {
        System.out.println("subtraction is :"+ (num1-num2));
break;
      }
      case '*':
      {
        System.out.println("multiplication is : "+ (num1*num2));
break;
      }
      case '/':
      {
                System.out.println("division is : "+ (num1/num2));
break;
      }
      case '%':
      {
        System.out.println("remainder is :"+ (num1%num2));
 break;
      }
      default:
        {
          System.out.println("wrong input sorry !!!");
break;
        }
    }
  }
}
