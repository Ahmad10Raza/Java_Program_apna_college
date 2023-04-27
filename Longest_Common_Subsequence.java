// A Naive Java recursive implementation
// of LCS of two strings

class Longest_Common_Subsequence {

    // Returns length of LCS for X[0..m-1], Y[0..n-1]
        static int lcs(String X, String Y, int m, int n) {
            if (m == 0 || n == 0) {
                return 0;
            }
    
            if (X.charAt(m - 1) == Y.charAt(n - 1)) {
                return  1 + lcs(X, Y, m - 1, n - 1);
            } else {
                return Math.max(lcs(X, Y, m, n - 1),lcs(X, Y, m - 1, n)); 
            }
        }
    // Driver Code
        //memoization code
    static int lcs2(String X, String Y, int m, int n,int dp[][])
 {
    if (m == 0 || n == 0) {
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }

        if (X.charAt(m - 1) == Y.charAt(n - 1)) {
            return dp[n][m]= 1+ lcs2(X, Y, m - 1, n - 1,dp);
        } else {
            return dp[n][m]=Math.max(lcs2(X, Y, m, n - 1,dp),lcs(X, Y, m - 1, n)); 
        }
    }
        public static void main(String[] args) {
            String X = "AGGTAB";
            String Y = "GXTXAYB";
    
            // Find the length of String
            int m = X.length();
            int n = Y.length();
            int dp[][]=new int [n+1][m+1];
            for(int i=0;i<n+1;i++)
            {
                for(int j=0;j<m+1;j++){
                    dp[i][j]=-1;
                }
            }
            System.out.println("Length of LCS: " + lcs(X, Y, m, n));
            System.out.println("Length of LCS: " + lcs2(X, Y, m, n,dp));

        }
    }
    
    