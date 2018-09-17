package com.javapattern.java;

public class Pattern1 {
	public static void main(String[] args) {
		for(int i=5;i>=0;i--)
		{
			for(int j=5;j>=i;j++)
			{
				System.out.println("");
			}
			System.out.print(" *");
		}
		
	}
}
