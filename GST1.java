import java.util.Scanner;
public class GST1
{
  public static void main(String[] args) {
    float pen,pencil,eraser;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter amout of pens: ");
    pen =in.nextInt();
    System.out.print("Enter amout of pencil: ");
    pencil =in.nextInt();
    System.out.print("Enter amout of eraser: ");
    eraser =in.nextInt();
float total=(pen+pencil+eraser);
float grand=total+total*0.18f;
System.out.println("total amout is :"+total);
System.out.println("Including_GST You have to pay:"+grand);
}
}
