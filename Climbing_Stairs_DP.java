public class Climbing_Stairs_DP {
    static int fib(int n, int dp[])
    {
      if (n <= 1)
        return dp[n] = 1;
   
      if (dp[n] != -1) {
        return dp[n];
      }
      dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
      return dp[n];
    }
   
    // Returns number of ways to
    // reach s'th stair
    static int countWays(int n)
    {
      int[] dp = new int[n + 1];
      for (int i = 0; i < n + 1; i++) {
        dp[i] = -1;
      }
      fib(n, dp);
      return dp[n];
    }
    public static int climbStairs_Tabulation(int n) {
        //DP
        int[] dp = new int[n + 1];
        if(n==0 || n==1){
            return 1;
        }
        
        if(n==2){
            return 2;
        }
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    // Driver code
    public static void main(String[] args)
    {
      int n = 5;
      System.out.println(countWays(n));
      System.out.println(climbStairs_Tabulation(n));
    }    
}
