// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class InfiniteSizeBinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,8,8,9,11,16,33,34,36,46,47,64,66,76};
        System.out.println(findinInf(arr,8));
    }
    
    static int findinInf(int[] arr,int t){
        int l=0;int h=(l+1);
        while(arr[h]<t){
            l=h;
            h=h*2;
        }
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>=t){ 
                h=mid-1;
                ans=mid;
            }
            else
             l=mid+1;
        }
        return ans;
    }
}
