import java.util.*;
class Main {
    public static void main(String[] args) {
           int arr[]={6,5,3,2,1,0,-2,-3,-4,-8};
           int arr2[]={-8,-4,-3,-2,0,1,2,3,5,6};
        Main.pair(arr);
        System.out.println();
        pair(arr2);
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
            if(arr[i]<smin && arr[i]!=min){
                smin=arr[i];
            }
        }

       System.out.println("Max  : "+ max);
       System.out.println("Min  : "+ min);
       System.out.println("smax : "+ smax);
       System.out.println("smin : "+ smin);
       System.out.println();
       
       System.out.println("Max Sum : "+ (max+smax));
       System.out.println("Min Sum : "+(min+smin));
       System.out.println("Max Product : "+ (Math.max((max*smax),(min*smin))));
       int a=(int) (min*max*1l);
       int b=(int)( max*smax*1l);
       int c=(int) (min*smin*1l);
       int val=Math.min(a,Math.min(b,c));
       System.out.println("Min Product : "+ val);
        
    }
}
