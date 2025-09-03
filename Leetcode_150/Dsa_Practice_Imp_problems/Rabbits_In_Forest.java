import java.io.*;
import java.util.*;

public class Solution {
    public static int numRabbits(int[] answers) {
        Map <Integer,Integer> fre = new HashMap<>();
        int count=0;
        for(int val : answers){
           if(val==0){
            count++;
            continue;
           }
           fre.put(val,fre.getOrDefault(val,0)+1);
        }
        for(int val : fre.keySet()){
            int row=(int) Math.ceil((double)fre.get(val)/(val+1));
            count=count + row *(val+1);
        }
        return (int)count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            int arr[]=new int[m];
            for(int j=0;j<m;j++){
                arr[j]=sc.nextInt();
            }
            int count=numRabbits(arr);
            System.out.println(count);
        }
    }
}


/*
In a forest, each rabbit has some color. Some subset of rabbits (possibly all of them) tell you how many other rabbits have the same color as them. Those answers are placed in an array/list named ‘ANSWERS.’

Return the minimum number of rabbits that could be in the forest.

For Example :

Given:- ‘N’ = 3, ‘ANSWERS’ = [2,2,2]

image

There are a total of 3 rabbits because each of the ‘ANSWERS[i]’ tells that there are two more rabbits just like them with the same color.

Input Format

T → Number of test cases
n1 → Size of array for Test Case 1
a1 a2 ... an1 → n1 space-separated integers
n2 → Size of array for Test Case 2
b1 b2 ... bn2 → n2 space-separated integers
Constraints

1 ≤ T ≤ 100 // Number of test cases
1 ≤ n ≤ 10^5 // Size of each array
0 ≤ ai ≤ 10^6 // Value of each element in the array
Output Format

res1 → Output for Test Case 1
res2 → Output for Test Case 2
Sample Input 0

2
3
2 2 2
4
0 1 1 0
Sample Output 0

3
4 
Explanation 0

For the first test case:

image

There are a total of 3 rabbits because each of the ‘ANSWERS[i]’ tells that there are two more rabbits just like them with the same color.

Sample Input 1

2
3
1 1 2
4
1 1 2 2
Sample Output 1

5
5
Explanation 1

For the second test case:

image

'ANSWERS[0]' and 'ANSWERS[3]' indicate that there exist two rabbits rabbit 1 and rabbit 4 which don't have the same color as any other rabbit. So, there are at least two rabbits. Now rabbit 2 and rabbit 3 tell that there is one more rabbit precisely like them (as indicated by 'ANSWERS[1]' and 'ANSWERS[2]').
Therefore, they can be of the same color.
*/
