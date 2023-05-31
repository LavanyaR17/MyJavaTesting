package com.testing;

class A
{
  int x;
  A(int x)
  {
    this.x=x; 
  }
  
  
  public boolean equals(Object obj)
  {
	  System.out.println(this.x);
	  System.out.println(((A)obj).x);
	  return this.x==((A)obj).x;
  }
}

public class Test 
{

	public static void main(String[] args)
	{
	 A a1 = new A(10);
	 A a2= new A(10);
	 System.out.println(a1.equals(a2));
	}

}
