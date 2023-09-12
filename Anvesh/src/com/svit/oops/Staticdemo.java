package com.svit.oops;

public class Staticdemo {
	int a;
	static int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticdemo x= new Staticdemo();
		
		x.a=10;
		x.b=10;
		System.out.println("a= "+x.a+"\tb with referance to object "+b);
		Staticdemo.b=20;
		System.out.println("a= "+x.a+"\tb with referance to class "+b);
		b=30;
		System.out.println("a= "+x.a+"\tb without referance "+b);
		
	}

}
