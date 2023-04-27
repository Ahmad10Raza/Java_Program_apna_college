import java.math.BigInteger;
// import java.util.*;
public class Catlan_Number {
    int catalan(int n)
    {
        int ans = 0;
 
        // Base case
        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            ans += catalan(i) * catalan(n - i - 1);
        }
        return ans;
    }
 int Catalan_Memoization(int n)
    {
        // Table to store results of subproblems
        int dp[] = new int[n + 2];
 
        // Initialize first two values in table
        dp[0] = 1;
        dp[1] = 1;
 
        // Fill entries in catalan[]
        // using recursive formula
        for (int i = 2; i <= n; i++) {
            dp[i] = 0;
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
 
        // Return last entry
        return dp[n];
    }
    int Catalan_Tabulation(int n){
        int dp[]=new int[n+1];
         dp[0]=1;
         dp[1]=1;
        for(int i=0;i<n+1;i++){
            for(int j=0;j<i;j++){
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }

    public static BigInteger findCatalan(int n)
    {
        // using BigInteger to calculate large factorials
        BigInteger b = new BigInteger("1");
 
        // calculating n!
        for (int i = 1; i <= n; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }
 
        // calculating n! * n!
        b = b.multiply(b);
 
        BigInteger d = new BigInteger("1");
 
        // calculating (2n)!
        for (int i = 1; i <= 2 * n; i++) {
            d = d.multiply(BigInteger.valueOf(i));
        }
 
        // calculating (2n)! / (n! * n!)
        BigInteger ans = d.divide(b);
 
        // calculating (2n)! / ((n! * n!) * (n+1))
        ans = ans.divide(BigInteger.valueOf(n + 1));
        return ans;
    }

    // Returns value of Binomial Coefficient C(n, k)
    static long binomialCoeff(int n, int k)
    {
        long res = 1;
 
        // Since C(n, k) = C(n, n-k)
        if (k > n - k) {
            k = n - k;
        }
 
        // Calculate value of [n*(n-1)*---*(n-k+1)] /
        // [k*(k-1)*---*1]
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
 
        return res;
    }
 
    // A Binomial coefficient based function
    //  to find nth catalan number in O(n) time
    static long Catalan_BT(int n)
    {
        // Calculate value of 2nCn
        long c = binomialCoeff(2 * n, n);
 
        // return 2nCn/(n+1)
        return c / (n + 1);
    }
    // Driver Code
    public static void main(String[] args)
    {
        Catlan_Number cn = new Catlan_Number();
        for (int i = 0; i < 10; i++) {
            System.out.print(cn.Catalan_Tabulation(i) + " ");
        }
    }
}
