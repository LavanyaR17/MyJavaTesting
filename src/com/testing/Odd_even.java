package com.testing;

public class Odd_even {

	public static void main(String[] args)
	{
		String odd=" ",even=" ";
		for(int i=20;i<=50;i++)
		{
			if(i%2==0)
			{
				even=even+i+",";
			}
			else
			{
				odd=odd+i+",";
			}
		}
		System.out.println("even no is"+even);
		System.out.println("odd no is"+odd);

	}

}
