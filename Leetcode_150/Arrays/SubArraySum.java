package com.samprit.practice;

import java.util.HashMap;

public class SubArraySum {

	public static void main(String[] args) {
		int arr[]= {2,3,4,-7,-6,-2,5,4,11};
		int target=7;
		int sum=0;
		int count=0;
		
		
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum==target) count++;
			if(map.containsKey(sum-target)) count +=map.get(sum-target);
				
		    map.put(sum,map.getOrDefault(sum, 0)+1);		
				
		}
		
		System.out.println(count);
		
	}

}
