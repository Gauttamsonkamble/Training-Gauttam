package com.training.java;

public class Demo {

	public static void main(String[] args) {
		
		String name="Gauttam";
		int length=name.length();
		char ch[]= name.toCharArray();
		
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
//				int j = 0;
				if (ch[i] == ch[j]) 
				{
					System.out.println(ch[j]);
//					break;
				}
			}
		}

	}

}
