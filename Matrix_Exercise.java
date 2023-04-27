import java.util.*;
public class Matrix_Exercise
{
  public static void Sum__Of_Matrix(int[][] matrix1,int[][] matrix2)
  {
    int row1=matrix1.length;
    int col1=matrix1[0].length;
    int row2=matrix2.length;
    int col2=matrix2[0].length;
if(row1==row2 && col1==col2)
{
int sum[][]=new int[row1][col1];
for(int i=0;i<row1;i++)
{
for(int j=0;j<col1;j++)
{
sum[i][j]=matrix1[i][j]+matrix2[i][j];
  }
}
System.out.println("Sum of matrix is >>>....");
for(int i=0;i<row1;i++)
{
for(int j=0;j<col1;j++)
{
System.out.print(sum[i][j]+" ");
}
System.out.println();
}
}
else
{
  System.out.print("Sum of matrix is not possible.");
}
}

public static void TransPose(int[][] matrix1, int[][] matrix2)
{
  int row1=matrix1.length;
  int col1=matrix1[0].length;
  int row2=matrix2.length;
  int col2=matrix2[0].length;
int trans1[][]=new int[row1][col1];
int trans2[][]=new int[row2][col2];
for(int i=0;i<row1;i++)
{
  for(int j=0;j<col1;j++)
  {
    trans1[j][i]=matrix1[i][j];
  }
}
System.out.println("Transpose of A is >>>...");
for(int i=0;i<row1;i++)
{
for(int j=0;j<col1;j++)
{
System.out.print(trans1[i][j]+" ");
}
System.out.println();
}

for(int i=0;i<row2;i++)
{
  for(int j=0;j<col2;j++)
  {
    trans2[j][i]=matrix1[i][j];
  }
}
System.out.println("Transpose of B is >>>...");
for(int i=0;i<row2;i++)
{
for(int j=0;j<col2;j++)
{
System.out.print(trans1[i][j]+" ");
}
System.out.println();
}

}

public static void Multiplication_Of_Matrix(int[][] matrix1,int[][] matrix2)
{
  int row1=matrix1.length;
  int col1=matrix1[0].length;
  int row2=matrix2.length;
  int col2=matrix2[0].length;
if(row1==col2 || col1==row2)
{
  int Mul[][]=new int[row1][col2];
  for(int i=0;i<row1;i++)
  {
    for(int j=0;j<col1;j++)
    {
      Mul[i][j]=0;
      for(int k=0;k<row1;k++)
      {
        Mul[i][j]+=matrix1[i][k]*matrix2[k][j];
      }
    }
  }
  System.out.println("Multiplication_Of_Matrix of A and B  is >>>...");
  for(int i=0;i<row1;i++)
  {
  for(int j=0;j<col2;j++)
  {
  System.out.print(Mul[i][j]+" ");
  }
  System.out.println();
  }
}
else
{
  System.out.print("Multiplication_Of_Matrix is not possible...");
}
}


public static void Sum_Of_Diagonal(int[][] matrix1, int[][] matrix2)
{
  int row1=matrix1.length;
  int col1=matrix1[0].length;
  int row2=matrix2.length;
  int col2=matrix2[0].length;
int sum1=0,sum2=0;
  if(row1==col1)
  {
    for(int i=0;i<row1;i++)
    {
      sum1+=matrix1[i][i];//primary diagonal
if(i !=row1-1-i)
{
  sum1+=matrix1[i][row1-i-1];
}
    }
  System.out.println("Sum_Of_Diagonal  of A is : "+sum1);
}
else
{
  System.out.print("Sum_Of_Diagonal  of A Not possible");
}

if(row2==col2)
{
  for(int i=0;i<row2;i++)
  {
    sum2+=matrix1[i][i];//primary diagonal
if(i !=row2-1-i)
{
sum2+=matrix2[i][row2-i-1];
}
  }
System.out.println("Sum_Of_Diagonal of B is : "+sum2);
}
else
{
System.out.print("Sum_Of_Diagonal of B Not possible");
}
}



  public static void main(String[] args)
  {
    Scanner IND=new Scanner(System.in);
    System.out.print("Enter Row  and Column of  Matrix A: ");
    int row1=IND.nextInt();
    int col1=IND.nextInt();
    int matrix1[][]=new int[row1][col1];
    for(int i=0;i<row1;i++)
{
  for(int j=0;j<col1;j++)
  {
    System.out.print("Enter the matrix Elements INDEX_"+i+j+": ");
    matrix1[i][j]=IND.nextInt();
  }
}
System.out.print("Enter the row and coloumn of matrix B : ");
int row2=IND.nextInt();
int col2=IND.nextInt();
int matrix2[][]=new int[row2][col2];
for (int i=0;i<row2 ;i++ )
 {
for(int j=0;j<col2;j++)
{
  System.out.print("Enter the matrix Elements Index_"+i+j+": ");
  matrix2[i][j]=IND.nextInt();
}
}
System.out.println("Matrix A is >>>....");
for(int i=0;i<row1;i++)
{
for(int j=0;j<col1;j++)
{
System.out.print(matrix1[i][j]+" ");
}
System.out.println();
}
System.out.println("Matrix B is >>>....");
for(int i=0;i<row2;i++)
{
for(int j=0;j<col2;j++)
{
System.out.print(matrix2[i][j]+" ");
}
System.out.println();
}
Sum__Of_Matrix(matrix1,matrix2);
TransPose(matrix1,matrix2);
Multiplication_Of_Matrix(matrix1,matrix2);
Sum_Of_Diagonal(matrix1,matrix2);
  }
}
