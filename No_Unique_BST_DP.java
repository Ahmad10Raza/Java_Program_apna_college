public class No_Unique_BST_DP {
    public static int dp[] = new int[20];
    static int number_Of_BST(int n)
    {
        // Base case
        if (n <= 1){
            return 1;
        }
        // In case if the value is already present in the
        // array just return it and no need to calculate it
        if (dp[n] > 0){//which stored in dp array
            return dp[n];
        }
        for (int i = 1; i <= n; i++){
            dp[n]+= number_Of_BST(i - 1) * number_Of_BST(n - i);
        }
        return dp[n];
    }
    public static int BST( int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                int left=dp[j];
                int right=dp[i-j-1];
                dp[i] += left*right;
            }
        }
        return dp[n];
        }
 
    // Driver Code
    public static void main(String[] args)
    {
        int n = 4;//N={1,2,3,4}
        System.out.println("Number of structurally "+ "Unique BST with " + n+ " keys are : "+ number_Of_BST(n));
        System.out.println("Number of structurally "+ "Unique BST with " + n+ " keys are : "+ BST(n));
    
    }
}
