package com.addon.fibonacci;

public class Fibonacci 
{

	public static void main(String[]arg)
	{
		int o1 = 0;
		int o2 = 1;
		int limit = 200;
		System.out.println(o1);
		for (int i = 0; o2 <= limit; i++)
		{
			System.out.println(o2);
			o2 = o2 + o1;
			o1 = o2 - o1;					
		}
		
		
	}
}
