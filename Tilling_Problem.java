import java.util.*;
public class Tilling_Problem
{
    public static int Tilling_Problem(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        //vertical setting
        int fnm1=Tilling_Problem(n-1);
        //horizontal setting
        int fnm2=Tilling_Problem(n-2);
        int totalways=fnm1+fnm2;
        return totalways;
    }
public static void main(String[] args) {
    Scanner IND=new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n=IND.nextInt();
    System.out.println("Total Ways is: "+Tilling_Problem(n));
    IND.close();
}
}
