package com.testing;

import java.util.LinkedList;
import java.util.Queue;

public class linkdlist {

	public static void main(String[] args)
	{
     Queue l1 = new LinkedList();
     l1.add("bangalore");
     l1.add("manalore");
     System.out.println(l1.peek());
     l1.poll();
     System.out.println(l1.peek());


	}

}
