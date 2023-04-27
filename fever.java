import java.util.Scanner;
public class fever
{
  public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    System.out.print("Enter your body temperature: ");
float temp=in.nextInt();
if(temp>100)
{
  System.out.println("You have fever contact with your docter: "+temp);
}
else
{
  System.out.println("you don't have fever : "+temp);
}
  }
}
