package com.testing;

public class Loop {

	public static void main(String[] args)
	{
	boolean flag=false;
	int n=4;
	for(int i=2;i<=n-1;i++)
	{
		if(n%i==0)
		{
		flag=true;
		break;
		}
	}
	if(flag)
	{
		System.out.println(" not prime");
	}
	else
	{
		System.out.println("prime");	
	}
		

	}

}
