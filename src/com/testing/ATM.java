package com.testing;

class InsufficentFund extends RuntimeException
{
	public String toString()
	{
		return "Insufficient balance please maintain minimum balance";
	}
}

public class ATM 
{
  double amount;
  
  ATM(double amount)
  {
	  this.amount=amount;
	  System.out.println("Account created successfully");
  }
  
  public void balance()
  {
	  System.out.println("Balance in the account is"+this.amount);
  }
  
  public void deposit(double amt)
  {
	  this.amount+=amt;
	  System.out.println("Deposit successful"+amt);
  }
  
  public void withdraw(double amt)
  {
      if(amt>this.amount)
      {
    	  throw new InsufficentFund();
      }
      else
      {
	  this.amount-=amt;
	  System.out.println("Witdraw amount is"+amt);
      }
  }
}
