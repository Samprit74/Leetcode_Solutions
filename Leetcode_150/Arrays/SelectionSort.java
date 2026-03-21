class SelectionSort {
    public static void main(String[] args) {
      
      int nums[]={6,1,2,9,0,2,4,6,7,4};
      
        for(int i :nums){
          System.out.print(i+" ");
      }
      System.out.println();
      for(int i=nums.length-1;i>=0;i--){
          int max=0;
          for(int j=0;j<=i;j++){
              if(nums[max]<=nums[j]) max=j;
          }
          int temp=nums[max];
          nums[max]=nums[i];
          nums[i]=temp;
      }
      
      for(int i :nums){
          System.out.print(i+" ");
      }
    }
}
