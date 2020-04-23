package com.vinit.ds.recursion;

public class ArraySortOrder {
	
	public static void main(String args[])
	{
		int arr[] = {1,3,33,4,55};
		System.out.println(isArrayInsortedOrder(arr,4));
	}

	public static int isArrayInsortedOrder(int a[], int index)
	{
		if(a.length==1)
			return 1;
		return (a[index-1] < a[index-2] ? 0 : isArrayInsortedOrder(a,index-1));
	}
}
