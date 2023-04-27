public class reverse_of_numbers
{
public static void main(String[] args) {
  int num=280903;
  while(num>0)
  {
    int lastDigit=num%10;
    System.out.print(lastDigit);
    num/=10;

  }
}
}
