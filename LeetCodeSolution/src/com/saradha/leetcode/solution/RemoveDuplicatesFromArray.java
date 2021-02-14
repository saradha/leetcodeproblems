package com.saradha.leetcode.solution;
import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int nums[]=  {0,0,1,1,1,2,2,3,3,4};
		Arrays.sort(nums);// sort array so the duplicates are placed adjacent
		//with out using extra memory with o(n) complexity
		int n= nums.length;
		int unique=0;
		 for (int i=0; i < n-1; i++){  
	            if (nums[i] != nums[i+1]){  
	            	nums[unique++]=nums[i];
	            }  
	        }  
		    nums[unique++] = nums[n-1];// increment the count for last element
           System.out.println(unique);
           for(int k=0;k<nums.length;k++) {
        	   System.out.println(nums[k]);
           }
	}

}
