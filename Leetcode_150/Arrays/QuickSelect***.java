package com.samprit.practice;

public class QuickSelect {
    static int findPart(int[] arr,int low ,int high) {
    	int pivot=arr[high];
    	int pos=low-1;
    	for(int j=low;j<high;j++) {
    		
    		if(arr[j]<pivot)arr[++pos]=(arr[pos]+arr[j])-(arr[j]=arr[pos]);
    	}
    	arr[++pos]=(arr[pos]+arr[high])-(arr[high]=arr[pos]);
    	return pos;
    }
    
    
    static int QuickSelecting(int[] arr,int low,int high,int k) {
    	
    	int pivot=findPart(arr,low,high);
    	if(pivot==k ) return arr[pivot];
    	else if(pivot>k)
    		return QuickSelecting(arr,0,pivot-1,k);
    	else 
    		return QuickSelecting(arr,pivot+1,arr.length-1,k);
    	
    }
	public static void main(String[] args) {
		int arr[]= {2,3,1,4,5,6,0,7,9,8};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int ans =QuickSelecting(arr,0,arr.length-1,4);
	    System.out.println();
        System.out.println(ans);
        System.out.println();
        
        for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}


	}

}
