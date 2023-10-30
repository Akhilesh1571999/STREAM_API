package com.StreamAPI;

public class LargestDuplicateNumber {

	public static void main(String[] args) {

		int [] arr = {1,2,3,2,2,9,8,10,9,6,7,4,99};
		
		
	int	largestNumber= 0;
		
	for(int i=0; i<arr.length; i++) {
		
		for(int j= i+1; j<arr.length; j++) {
			
			if(arr[i]==arr[j] && arr[i]>largestNumber) {
				largestNumber=arr[i];
			}
		}
	}
	System.out.println("Largest duplicate number in array is >> " + largestNumber);
	}

}
