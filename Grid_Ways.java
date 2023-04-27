import java.util.*;
public class Grid_Ways
{
  public static int Grid_Ways(int i,int j,int n,int m)
  {
    //base
    if(i==n-1 && j==m-1)
    {
      return 1;
    }
    if(i==n || j==m)
    {
      return 0;
    }
    int w1=Grid_Ways(i+1,j,n,m);
    int w2=Grid_Ways(i,j+1,n,m);
    return w1+w2;
  }

  public static void main(String[] args) {
    Scanner IND=new Scanner(System.in);
    System.out.print("Enter the order of Grid:..");
int n=IND.nextInt();
int m=IND.nextInt();
    System.out.print(Grid_Ways(0,0,n,m));
  }
}
