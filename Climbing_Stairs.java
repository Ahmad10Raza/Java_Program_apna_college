public class Climbing_Stairs {
    public static int stairs_rec (int n){
        
            if (n <= 1)
            {
                return n;
            }
            return stairs_rec(n - 1) + stairs_rec(n - 2);
        
        }
            
        public static void main(String args[])
        {
            int n = 300;
            System.out.println("Number of ways = " + stairs_rec(n));
        }
    } 

