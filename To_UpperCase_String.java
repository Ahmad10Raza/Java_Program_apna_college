import java.util.*;
public class To_UpperCase_String
{
  public static void To_UpperCase_String(String str)
  {
        System.out.print(" String in Lowercase:"+str);
    char strArray[]=str.toCharArray();
    for (int i=0;i<strArray.length ;i++ )
     {
    if(strArray[i]>='a' && strArray[i]<='z')
    {
      strArray[i]=(char)((int)strArray[i]-32);
    }
  }
  System.out.println("String in Upper case ...");
  for(int i=0;i<strArray.length;i++)
  {
    System.out.print(strArray[i]);
  }
}
public static String To_UpperCase_String_Using_StringBuilder(String str)
{
  System.out.println("String in lowe case: "+str);
  StringBuilder sb=new StringBuilder("");
  char ch=Character.toUpperCase(str.charAt(0));
  sb.append(ch);
  for(int i=1;i<str.length();i++)
  {
    if(str.charAt(i)==' ' && i<str.length()-1)
    {
      sb.append(str.charAt(i));
      i++;
      sb.append(Character.toUpperCase(str.charAt(i)));
    }
    else
    {
      sb.append(str.charAt(i));
    }
  }
  return sb.toString();
}

  public static void main(String[] args)
   {
     Scanner IND=new Scanner(System.in);
     System.out.print("Enter the String in Lowercase:...");
     String str=IND.nextLine();
//To_UpperCase_String(str);
System.out.println(To_UpperCase_String_Using_StringBuilder(str));
  }
}
