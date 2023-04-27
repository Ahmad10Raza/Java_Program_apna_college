import java.util.*;
public class N_Queen
{
  public static boolean isSafe(int row,int col,char board[][])
  {
    int i,j;
    //checking for vertical up
    for( i=row-1;i>=0;i--)
    {
      if(board[i][col]=='Q')
      {
        return false;
      }
    }
    //checking  for Diagonal Left Up
    for( i=row-1, j=col-1; i>=0 && j>=0; i--,j--)
    {
      if(board[i][j]=='Q')
      {
        return false;
      }
    }
    //checking for vertical Right Up
    for(i=row-1,j=col+1 ;i>=0 && j<board.length; i--,j++)
    {
      if(board[i][j]=='Q')
      {
        return false;
      }
    }
    return true;
  }
  public  static void N_Queen(char board[][],int row)
  {
    //Base  case
    if(row==board.length)
    {
      print_Board(board);
      return;
    }
    //putting Queen in coloumn
    for(int j=0;j<board.length;j++)//Settting Queen in single to coloumn
    {
      if(isSafe(row,j,board))
{
  board[row][j]='Q';
  N_Queen(board,row+1);//Function call
  board[row][j]='X';//backtracking step
}
    }
  }
  public static void print_Board(char board[][])
  {
    System.out.println("______Ches_Board________");
    for(int i=0;i<board.length;i++)
    {
      for(int j=0;j<board.length;j++)
      {
        System.out.print(board[i][j]+" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
int n=4;
char board[][]=new char[n][n];
//intlize
for(int i=0;i<n;i++)
{
  for(int j=0;j<n;j++)
{
  board[i][j]='X';
}
}
N_Queen(board,0)  ;
  }
}
