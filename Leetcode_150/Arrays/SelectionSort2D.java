
class SelectionSort2D {
    public static void main(String[] args) {
      
      int nums[][]={
          {8,4},
          {7,6},
          {2,3},
          {3,6},
          {2,8},
          {4,1},
          {2,1}
                };
      
        for(int[] i :nums){
          System.out.println(i[0]+"-"+i[1]+" ");
      }
      System.out.println();
      for(int i=nums.length-1;i>=0;i--){
          int max=0;
          for(int j=0;j<=i;j++){
              if(nums[max][0]<nums[j][0] ||(nums[max][0]==nums[j][0]&& nums[max][1]<nums[j][1])) max=j;
             
              }
              int temp0 = nums[i][0];
            int temp1 = nums[i][1];

            nums[i][0] = nums[max][0];
            nums[i][1] = nums[max][1];

            nums[max][0] = temp0;
            nums[max][1] = temp1;
          }
           for(int[] i :nums){
          System.out.println(i[0]+"-"+i[1]+" ");
      }
      }}
      
      
    
