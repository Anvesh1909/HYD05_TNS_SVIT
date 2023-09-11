package com.myprograms;

import java.util.Scanner;

class Prime {
	
	static int IsPrime(int p) {
		if(p<1)
			return 0;
		if(p==1)
			return 1;
		else
		{
			for(int i=2;i<(int)(p/2+1);i++)
			{
				if(p%i==0) {
					return 2;
				}
					
			}
			return 3;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stop,p,i;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("enter a number:");
			
			p= sc.nextInt();
			i=IsPrime(p);
			
			
			switch (i) {
			case 0: 
				System.out.println("entered number is less than 1");
				break;
			case 1:
				System.out.println("1 is nither prime or composite");
				break;
			case 2:
				System.out.println(p+" is a composite number");
				break;
			case 3:
				System.out.println(p+" is a prime number");
				break;
			}
			
			System.out.println("do you want to continue [0/1]: ");
			stop= sc.nextInt();
			
		} while (stop!=0);
	}

}
