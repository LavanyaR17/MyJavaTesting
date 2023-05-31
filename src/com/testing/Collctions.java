package com.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collctions {

	public static void main(String[] args)
	{
		//For Strings to convert Array to arraylist
//		String[] obj = {"banalore","mangalore"};
//		List l1 =Arrays.asList(obj);
//		System.out.println(l1);
		
		
		//For Integer to convert Array to arraylist
		Integer[] i1 = {10,20,30,40};
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(i1));
		System.out.println(l1);
	}

}
