import java.util.*;
public class Vowel_Count
{
  public static void main(String[] args)
   {
     Scanner IND=new Scanner(System.in);
    System.out.print("Enter the String: ");
    String str=IND.nextLine();
    int count=0;
    str=str.toLowerCase();
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' )
{
  count++;
}
    }
    System.out.print("Total Vowel is: "+count);
  }
}
