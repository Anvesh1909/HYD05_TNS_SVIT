package com.svit.oops;

import java.util.Scanner;

class Cube {
	
	int TSA(int s)
	{
		return 6*s*s;
	}
	int LSA(int s)
	{
		return 4*s*s;
	}
	
	static int volume(int s) {
		return s*s*s;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Cube c= new Cube();
		System.out.println("enter the side of cube");
		int s= sc.nextInt();
		
		System.out.println("TSA of cube with side"+ s+"= "+c.TSA(s));
		System.out.println("LSA of cube with side"+ s+"= "+c.LSA(s));
		System.out.println("volume using class referance of cube with side"+ s+"= "+Cube.volume(s));
		System.out.println("volume using object referance of cube with side"+ s+"= "+c.volume(s));
		System.out.println("volume using no referance of cube with side"+ s+"= "+volume(s));
		
	}
}
