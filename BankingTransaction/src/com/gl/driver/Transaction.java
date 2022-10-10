package com.gl.driver;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = obj.nextInt();
		
		System.out.println("Enter the values in the transaction");
		int[] TransactionArray = new int[size];
		
		for(int i=0; i<size; i++)
		{
			TransactionArray[i] = obj.nextInt();
		}
		
		System.out.println("Enter the target amount");
		int target = obj.nextInt();
		
		// Traverse the array and check if the target is achieved.
		int sum =0;
		int index = 0;
		boolean flag = false;
		
		for(int i=0; i<size; i++)
		{
			sum += TransactionArray[i];
			index = i+1;
			
			if(sum >= target)
			{
				flag = true;
				break;
			}

		}
		
		if(flag == true)
		{
			System.out.println("Target achieved after " + index + " transction.");
		}
		else
		{
			System.out.println("Target not achieved.");
		}
	
		obj.close();
	}

}
