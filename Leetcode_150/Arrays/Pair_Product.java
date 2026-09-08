import java.util.*;
class Pair_Product {
    public static void main(String[] args) {
           int arr[]={5,4,3,2,1,-2,-3,-4,-8};
        Main.pair(arr);
    }

   public static void pair(int[] arr){
        int max=arr[0],smax=arr[1],min=arr[0],smin=arr[1];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            if(arr[i]<smin){
                smin=arr[i];
            }
        }


       System.out.println("Max Sum : "+ (max+smax));
       System.out.println("Min Sum : "+(min+smin));
       System.out.println("Max Product : "+ (Math.max((max*smax),(min*smin))));
       System.out.println("Min Product : "+ (max*min));
        
    }
}
