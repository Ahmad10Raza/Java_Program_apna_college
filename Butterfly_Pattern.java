import java.util.*;
public class Butterfly_Pattern
{
  public  static void Butterfly_Pattern(int N)
  {
  int space = 2*N-1;
         int star = 0;
         // use for loop
                 for(int j = 1; j <= 2*N-1; j++){
                         if(j <= N){
                             space = space - 2;
                             star++;
                         }
                         else {
                             space = space + 2;
                             star--;
                         }
             // use for loop to print star
                         for(int m = 1; m <= star; m++){
                          System.out.print("*");
                         }
             // use for loop to print space
                         for(int n = 1; n <= space; n++){
                             System.out.print(" ");
                         }
             // use for loop to print star for special case
                         for(int p = 1; p <= star; p++){
                             if(p != N){
                     System.out.print("*");
                 }
                         }
                         System.out.println();
                 }
     }


  public static void main(String[] args)
  {
    System.out.print("Enter the order of Order of pyramid : ");
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    Butterfly_Pattern(N);

  }
}
