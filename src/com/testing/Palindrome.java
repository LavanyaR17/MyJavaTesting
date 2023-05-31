package com.testing;

public class Palindrome {

	public static void main(String[] args)
	{
	String str1 = "Malayalam";
	String str2 = "";
	for(int i=str1.length()-1;i>=0;i--)
	{
		str2=str2+str1.charAt(i);
	}
    if(str1.equalsIgnoreCase(str2))
    {
    	System.out.println("palindrome " +str2);
    }
    else
    {
    	System.out.println("not palindrome");
    }
		
//	    String str1="Mom", str2 = "";     
//	    for(int i=str1.length()-1;i>=0;i--) 
//	    {
//	         str2 = str2 + str1.charAt(i);  
//	    }
//	      if (str1.equalsIgnoreCase(str2)) 
//	      {
//	         System.out.println("palindrome.");  
//	      }
//	      else  
//	      {
//	         System.out.println("not palindrome.");
//	      }
	}

}
