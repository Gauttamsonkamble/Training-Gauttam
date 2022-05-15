package com.training.java;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String name = "Gauttam";
		
		int length = name.length();
		
		char ch[] = name.toCharArray();
		
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
					
				}
			}
		}

	}

}
