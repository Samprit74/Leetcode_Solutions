import java.io.*;
import java.util.*;

public class Solution {
    static List<int[]> merged_interval(List<int[]>demo){
        List<int[]> merged=new ArrayList<>();
        for(int[] interval:demo){
            if(merged.isEmpty() || merged.get(merged.size()-1)[1] < interval[0]) 
                merged.add(interval);
            else 
                merged.get(merged.size()-1)[1]= Math.max(merged.get(merged.size()-1)[1],interval[1]);
        }
        List<int[]> freeTime=freeIntervals(merged);
       
        return freeTime;
    } 
    
    static List<int[]> freeIntervals(List<int[]> demo){
        int start_day=0;int end_day=(int)1e8;
        List<int[]> free=new ArrayList<>();
        //before intervals
        if(demo.get(0)[0] > start_day) free.add(new int[]{start_day,demo.get(0)[0] -1});
        //in  each interval
        for(int i=1;i<demo.size();i++){
            int start=demo.get(i-1)[1]+1;
            int end=demo.get(i)[0]-1;
            if(start<=end)
                free.add(new int[]{start,end});
        }
        //after interval
        if(demo.get(demo.size()-1)[1] < end_day)
            free.add(new int[]{demo.get(demo.size()-1)[1]+1,end_day});
        
        return free;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int a=0;a<T;a++){
            int N=sc.nextInt();
            List<int[]> demo=new ArrayList<>();
            for(int i=0;i<N;i++){
                int K=sc.nextInt();
                for(int j=0;j<K;j++){
                    demo.add(new int[]{sc.nextInt(),sc.nextInt()});
                }
            }
                
               
            demo.sort((a1,b1)->Integer.compare(a1[0],b1[0]));
            
            List<int[]> array= merged_interval(demo);
            for(int[] arr : array){
                System.out.print( arr[0]+" "+ arr[1]+" ");
            }
           System.out.println();                      
        }sc.close();
    }
}

/* DESCRIPTION OF THE PROBLEM*/

/* leetcode 759*/
/*
There are ‘N’ Problem Setters in Coding Ninjas, Each of them has a unique id between 0 to N-1. A Problem Setter works in multiple non-overlapping time intervals during a day.

Formally, A Problem Setter having id ‘i’ works in ‘Ki’ non-overlapping intervals of the form [T1, T2], [T3, T4] ... [T(2ki-2), T(2ki-1)], where Ti is in between [0, 10^8] and Ti <= T(i+1). A day in Coding ninjas start from time 0 and end at time 10^8 (both inclusive).

You are given ‘N’ sorted lists of non-overlapping intervals, where the ith list gives a schedule (list of intervals in which the problem setter works) of a Problem Setter having id ‘i’. Your task is to find a sorted list of non-overlapping intervals in which all problem setters are free. If there are multiple possible such lists, output the list which is minimum in length.

Note :

In sorted order interval [T1, T2] comes before [T3, T4] if either T1 < T3, or (T1 == T3 and T2 < T4).
An interval [T1, T2] represents, time T1, T1+1, T1+2, ... T2, i.e all integers between T1, T2 both T1 and T2 inclusive.
For simplicity, we represent the list of intervals in a 1D array where every two numbers show an interval, i.e list [1, 3, 5, 7, 9, 11] represent intervals [1, 3], [5, 7] and [9, 11]
It is guaranteed that there will be at least one interval where all problem setters are free. Example :
Let suppose there are 3 problem setters, their working intervals are represented by the following list of lists, ‘Schedules’: [[1, 2, 5, 6], [1,2], [5, 10]], where the ith interval of a setter is represented by 2*i and (2*i+1)th integer in their respective list, I.e. Problem Setter with an id 0, works in the intervals [1, 2], [5, 6]. Problem Setter with an id 1, work in the interval [1,2]. Problem Setter with id 2, works in the interval [5, 10], In this example, the time intervals where setter 0 is free are [0, 0], [3, 4], [7, 10^8] And the time intervals where setter 1 is free are [0, 0], [3, 10^8]. And the time intervals where setter 2 is free are [0, 4], [11, 10^8]. We can clearly observe that time intervals, where all 3 setters are free are, [0, 0], [3, 4], and [11, 10^8].
Thus we should output a list [0, 0, 3, 4, 11, 10^8] that represents these lists in 1D array form as described in notes. It can be shown easily, that this is the minimum possible length list of intervals representing common free time.

Input Format

The first line of input contains an integer 'T' denoting the number of test cases, then 'T' test cases follow.
The first line of each test case consists of a single integer 'N' representing the number of problem setters.
Then '2**N' line follows, which gives the 'schedule' of each of the problem setters. The 2*i+1th line consist of single even integer 'Ki' representing the number of intervals of ith problem setter and (2*i+2)th line consist of 2*Ki space-separated integers representing the list of intervals in a 1-D array.
Constraints

1 <= T <= 10
1 <= N <= 1000
1 <= K <= 1000
Output Format

For each test case, in a separate line print the smallest and sorted list of non- overlapping intervals that give the common free time of 'N' problem setters. I.e if there are 'K' such intervals, then you need to print 2*K space-separated integers representing this list in a 1-D array.
Sample Input 0

2
1
1
10 20
3
2
1 2 5 6
1
1 2
1
5 10
Sample Output 0

0 9 21 100000000
0 0 3 4 11 100000000
Explanation 0

Test case 1: There is only one problem setter, who is busy during an interval [10, 20]. A day in coding ninjas is given by interval [0, 10^8], thus he will be free between [0, 9] and [21, 10^8]

Test case 2: See the problem statement for an explanation.

Sample Input 1

2
1
1
1 100000000
3
2
1 2 5 6
3
1 1 2 2 3 3
1
0 2
Sample Output 1

0 0
4 4 7 100000000
*/



