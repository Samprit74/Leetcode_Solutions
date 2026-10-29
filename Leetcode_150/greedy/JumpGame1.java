class JumpGame1 {
    public static void main(String[] args) {
        

        int[] arr = new int[]{2,2,0,5};
        System.out.print(func(arr));
    }

    static boolean func(int []arr){
        int lr =arr.length-1;
        for(int i=arr.length-2;i>=0;--i){
            lr=(arr[i]+i>=lr)?i:lr;
        }

        return lr == 0;
    }
















    
}
