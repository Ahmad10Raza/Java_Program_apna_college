import java.util.Arrays;
class Unbounded_Knapsack {

	// A utility function that returns
	// maximum of two integers
	static int max(int a, int b) { return (a > b) ? a : b; }

	// Returns the maximum value that
	// can be put in a knapsack of
	// capacity W
	static int unboundedKnapsack(int W, int wt[], int val[],
								int idx, int dp[][])
	{
		// Base Case
		// if we are at idx 0.
		if (idx == 0) {
			return (W / wt[0]) * val[0];
		}

		// If the value is already calculated then we will
		// previous calculated value
		if (dp[idx][W] != -1)
			return dp[idx][W];
		// There are two cases either take element or not
		// take. If not take then
		int notTake= 0+ unboundedKnapsack(W, wt, val, idx - 1, dp);
		// if take then weight = W-wt[idx] and index will
		// remain same.
		int take = Integer.MIN_VALUE;
		if (wt[idx] <= W) {
			take = val[idx]+ unboundedKnapsack(W - wt[idx], wt, val,idx, dp);
		}
		return dp[idx][W] = max(take, notTake);
	}
      public static int knapsack_2(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<W+1;j++){
            dp[0][j]=0;
        }
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
        if(wt[i-1]<=j){
          dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
        }
        else{
            dp[i][j]=dp[i-1][j];
        }
            }
        }
        return dp[n][W];
      }
	// Driver code
	public static void main(String args[])
	{
		int W = 100;
		int val[] = { 10, 30, 20 };
		int wt[] = { 5, 10, 15 };
		int n = val.length;
		int[][] dp = new int[n][W + 1];
		for (int row[] : dp)
			Arrays.fill(row, -1);
		// System.out.println(unboundedKnapsack(W, wt, val, n - 1, dp));
	System.out.println(knapsack_2(val, wt, W));
    }
}
