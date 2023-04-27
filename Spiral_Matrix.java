import java.util.*;
public class Spiral_Matrix
{
  public static void main(String[] args)
   {
  Scanner IND=new Scanner(System.in);
  System.out.print("Enter the row and coloum of Matrix: ");
  int r=IND.nextInt() ;
  int c=IND.nextInt() ;
  int[][] Matrix=new int[r][c];
System.out.print("Enter the Elements of Matrix: ");
for(int i=0;i<r;i++)
{
  for(int j=0;j<c;j++)
  {
  Matrix[i][j]=IND.nextInt();
  }
}
System.out.println(" the Elements of Matrix: ");
for(int i=0;i<r;i++)
{
  for(int j=0;j<c;j++)
  {
  System.out.print(Matrix[i][j]+" ");
  }
  System.out.println();
}
int sr=0;
int sc=0;
int er=r-1;
int ec=c-1;
while(sr<=er && sc<=ec)
{//for top boundary
  for(int i=sc;i<ec;i++)
  {
    System.out.print(Matrix[sr][i]+" ");
  }
  //for right boundary
  for(int i=sr+1;i<=er;i++)
  {
    System.out.print(Matrix[i][ec]+" ");
  }
  //bottom boundary
  for(int i=ec-1;i>=sc-1;i--)
  {
    if(sc==ec)
    {
      break;
    }
    System.out.print(Matrix[er][i]+" ");
  }
  //left
  for(int i=er-1;i>=sr+1;i--)
  {
    System.out.print(Matrix[i][sc]+" ");
  }
  sr++;
  sc++;
  er--;
  ec--;
}
System.out.println();

  }
}
