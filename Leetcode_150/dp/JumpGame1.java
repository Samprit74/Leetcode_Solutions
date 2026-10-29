class JumpGame1{
    public static void main(String[] args) {
        

        int[] arr = new int[]{2,2,0,5,4,8,2,1,0,9,7,5,4,3};

        boolean dp[] = new boolean[arr.length];
        System.out.println(find(0,arr,dp));

        for(int i=0;i< dp.length;++i)
            System.out.print(dp[i]+" ");
    }



    static boolean find(int curr,int[] arr,boolean []dp){
        if(curr>=arr.length)
            return true;
        if((curr<arr.length-1) && (arr[curr]==0))
            return false;
        int val = arr[curr];
        if(dp[curr])
            return dp[curr];
        
        boolean res=false;
        for(int i=1;i<=val;i++){
            res = res||find(curr+i,arr,dp);
        }
        return dp[curr]=res;       
        
    }
}
