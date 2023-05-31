package com.testing;

public class Run {

	public static void main(String[] args)
    {
	ATM c1=new ATM(20000);
	c1.balance();
	c1.deposit(5000);
	c1.balance();
	c1.withdraw(30000);
	c1.balance();
    }
}
