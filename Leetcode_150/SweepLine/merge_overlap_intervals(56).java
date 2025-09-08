import java.util.Vector;  
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> events=new Vector<>();
        for(int[] arr:intervals){
            events.add(new int[]{arr[0],+1});
            events.add(new int[]{arr[1],-1});
        }
      
        events.sort((a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            else return a[0]-b[0];
        });
        List<int[]> result=new Vector<>();
        int alive=0;//for denoting no of intervals going 
        int start=-1;// for indexing the starting index so to keep it out of indexes we choose (-1)
        for(int[] event: events){
        /*
        first check if it is 0 means it enters the arena . then we will add the impact to variable(alive)
        so after that if the value still remains as 0 then we directly add the interval thats how we keep up with the 
        zero interval events a.k.a [0,0],[4,4
        ]*/   
        if(alive==0) start=event[0];
        alive+=event[1];
        if(alive==0) result.add(new int[]{start,event[0]});
        }

        return result.toArray(new int[0][]);
    }
}
