public class Knapsack_0_1 {
    public static int Knapsack(int val[],int wt[],int w,int n){//T.C=O(2^n)
        if(w==0 || n==0){
            return 0;
        }
        if(wt[n-1]<=w){
            //valid
            int ans1=val[n-1]+Knapsack(val, wt, w-wt[n-1], n-1);
            //exclude
            int ans2=Knapsack(val, wt, w, n-1);
            return Math.max(ans1,ans2);
        }
        else{
            return Knapsack(val, wt, w, n-1);
        }
    }


    public static int Knapsack_Memoization(int val[],int wt[],int w,int n,int dp[][]){//T.C=O(n*w)
        if(w==0 || n==0){
            return 0;
        }
        if(dp[n][w]!=-1){
            return dp[n][w];
        }
        if(wt[n-1]<=w){
            //valid
            int ans1=val[n-1]+Knapsack_Memoization(val, wt, w-wt[n-1], n-1,dp);
            //exclude
            int ans2=Knapsack_Memoization(val, wt, w, n-1,dp);
             dp[n][w]=Math.max(ans1,ans2);
            return dp[n][w];
        }
        else{//not valid
            dp[n][w]=Knapsack_Memoization(val, wt, w, n-1, dp);
            return dp[n][w];
        }
    }
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int Knapsack_Tabulation(int val[],int wt[],int w){
        int n=val.length;
        int dp[][]=new int[n+1][w+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;//0th coloumn
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;//0th row
        }
        for(int i=0;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                int v=val[i-1];//ith item value
                int W=wt[i-1];//ith item weight
                if(W<=j){
                    int incprofit=v+dp[i-1][j-W];
                    int excprofit=dp[i-1][j];
                    dp[i][j]=Math.max(incprofit,excprofit);   
                 }
                
            else {
                int excprofit=dp[i-1][j];
                dp[i][j]=excprofit;
            }
            }
            }
            print(dp);
        return dp[n][w];
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int w=7;
        int dp[][]=new int[val.length+1][w+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }

        // System.out.println(Knapsack(val, wt, w, val.length));
        // System.out.println(Knapsack_Memoization(val, wt, w, val.length, dp));
        System.out.println(Knapsack_Tabulation(val, wt, w));
    }
}
 