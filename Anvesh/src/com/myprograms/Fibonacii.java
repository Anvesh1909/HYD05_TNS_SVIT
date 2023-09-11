package com.myprograms;

import java.util.Scanner;

public class Fibonacii {

	public static void Numbers(int count) {
		 int n1=0,n2=1,n3;    
		 System.out.print(n1+" "+n2);
		    
		 for(int i=2;i<count;++i) 
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }  
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range: ");
		int count = sc.nextInt();
		Numbers(count);
	}

}
