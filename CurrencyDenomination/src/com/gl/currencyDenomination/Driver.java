package com.gl.currencyDenomination;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of currency denomination");
		
		int size = scanner.nextInt();
		System.out.println("Enter the denomination value");
		
		int[] denomination = new int[size];
		
		for(int i =0; i<size; i++)
		{
			denomination[i] = scanner.nextInt();
		}
			
		System.out.println("Enter the amount needs to be payed");
		int amount = scanner.nextInt();
		
		Sorting sort = new Sorting();
		
		denomination = sort.sort(denomination);
		
		for(int i = 0; i < denomination.length; i++)
		{
			System.out.println(denomination[i]);
		}
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		
		int[] count = new int[size];
		
		for(int i =0; i<size; i++)
		{
			if(amount>=denomination[i])
			{
				count[i] = amount/denomination[i];
				amount = amount - count[i]*denomination[i];
			}
		
		}
		
		if(amount > 0)
		{
			System.out.println("Entered amount cannot be paid with given denomination");
		}
		
		for(int j =0; j<size; j++)
		{
			if(count[j] != 0)
			{
				System.out.println(denomination[j]+ " : " + count[j]);
			}
		}
		
		scanner.close();
	}

}
