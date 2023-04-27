import java.util.Scanner;
public class WEEK
{
  public static void main(String[] args) {
    int num;
    System.out.print("Enter the number(1-7) :");
    Scanner in=new Scanner(System.in);
    num=in.nextInt();
    switch (num)
     {
      case 1:
      {
        System.out.println("MONDAY");
        break;
      }
      case 2:
      {
        System.out.println("TUESDAY");
break;
      }
      case 3:
      {
        System.out.println("WEDNESDAY");
break;
      }
      case 4:
      {
                System.out.println("THURSDAY");
break;
      }
      case 5:
      {
        System.out.println("FRIDAY");
 break;
      }
      case 6:
      {
        System.out.println("SATURDAY");
break;
      }
      case 7:
      {
        System.out.println("SUNDAY");
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
