package com.testing;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Sort_wo_for {

	public static void main(String[] args)
	{
		String[] str = {"bangalore","Akash","Canada","Mangalore"};
		Set t1 = new TreeSet();
		Collections.addAll(t1, str);
		System.out.println(t1);

	}

}
