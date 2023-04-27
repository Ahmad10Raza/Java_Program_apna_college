
import java.util.*;
public class Hollow_Inverted_Half_pyramid
{
public static void main(String[] args)
{
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the order of Pyramid: ");
n = sc.nextInt();
int i, j, k = 0;
for (i = 0; i < n; i++)
{
System.out.print("*");
}
for(i=n; i>=1; i--)
{
for(j=0; j < n-i; j++)
while (k != (2 * i - 1))
{
if (k == 0 || k == (2 * i - 2))
{
System.out.print("*");
}
else
{
System.out.print(" ");
k++;
}
}
k = 0;
System.out.println(); // print next row
}
}
}
