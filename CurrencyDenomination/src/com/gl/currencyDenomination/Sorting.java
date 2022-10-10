package com.gl.currencyDenomination;

//Using merge sort

public class Sorting {

	public int[] sort(int array[])
	{
		int mid = array.length/2;
		
		int leftArray[] = new int[mid];
		int rightArray[] = new int[array.length - mid];
		
		if(array.length < 2)
		{
			return array;
		}
		
		for(int i = 0; i < mid; i++)
		{
			leftArray[i] = array[i];
		}
		for(int i  = mid; i < array.length; i++)
		{
			rightArray[i-mid] = array[i];
		}
		
		leftArray = sort(leftArray);
		rightArray = sort(rightArray);
		
		return merge(leftArray, rightArray);
		
	}
	
	public static int[] merge(int leftArray[], int rightArray[])
	{
		int i = 0, j = 0, k = 0; 
		
		int[] resultArray = new int[leftArray.length + rightArray.length];
		
		while(i < leftArray.length && j < rightArray.length)
		{
			if(leftArray[i] >= rightArray[j])
			{
				resultArray[k] = leftArray[i];
				i++;
			
			}
			else
			{
				resultArray[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i < leftArray.length)
		{
			resultArray[k] = leftArray[i];
			i++;
			k++;
			
		}
		while(j < rightArray.length)
		{
			resultArray[k] = rightArray[j];
			j++;
			k++;
		}
		
		return resultArray;
	}
	
}
