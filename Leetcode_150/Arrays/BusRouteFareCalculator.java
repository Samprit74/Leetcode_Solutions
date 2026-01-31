/*
📝 Problem Statement (Exact, Clear, Upload-Ready)

You are given a circular bus route with N bus stops.
Each bus stop has a unique name. The distance between consecutive bus stops is provided, and the last bus stop connects back to the first, forming a circular path.

Input Format

An integer N representing the number of bus stops.

N space-separated strings representing the names of the bus stops.

N integers, each on a new line, representing the distance (in meters) between consecutive bus stops in clockwise order.

A string src representing the source bus stop.

A string dest representing the destination bus stop.

Rules

Travel is only allowed in the clockwise direction.

If the source and destination bus stops are the same, return -1222.

The fare is calculated as:

₹5 for every 1000 meters traveled

Distance is rounded up to the nearest 1000 meters before fare calculation.

Output

Print a single integer representing the calculated fare.

💡 Example
Input
5
a b c d e
100
2000
4000
6999
20
c
b

Output
50

*/

import java.util.Scanner;
class Main {
    static int path[];
    static String BusStop[];
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int size = sc.nextInt();
       BusStop = new String[size];
       path = new int[size];
       
       for(int i=0;i<size;i++){
           BusStop[i]=sc.next().toUpperCase();
       }
       sc.nextLine();
       for(int i=0;i<size;i++){
          path[i]=Integer.parseInt(sc.nextLine().trim());
       }
       int ans=findfee(sc.nextLine().trim(),sc.nextLine().trim());
       sc.close();
       System.out.println(ans);
    }
    
    
    
    
    static int findfee(String src,String dest){
        src=src.toUpperCase();
        dest =dest.toUpperCase();
        int s=-3;int d=-3;
        for(int i=0;i<BusStop.length;i++){
            if(BusStop[i].equals(src)) s=i;
            if(BusStop[i].equals(dest)) d=i;
        }
        if(s==d) return -1222;
        s++;
        int distance=0;
        while(s!=d+1){
            distance+=path[s];
            s=(s+1)%path.length;
        }
        return ((distance+999)/1000)*5;
        
    }
}
