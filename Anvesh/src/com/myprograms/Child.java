package com.myprograms;

class Child extends Parent  {
	
	static int a=1; 
	Child()
	{
		System.out.println("\nChild class constructer "+a++);
	}
	
	String sum()
	{
		return "Child Sum";
	}
	public static void main(String[] args) {
		Parent p1= new Parent();
		Child c1 = new Child();
		Parent p2 = new Child();

		//Child c1 = new Parent();
		
		System.out.println(p1.sum());

		System.out.println(c1.sum());

		System.out.println(p2.sum());

		System.out.println(p1.sum(1,2));

		//System.out.println(p1.sum(3.2,2.5));
		
		//System.out.println(p1.sum(1,4.3));
		
	}

}
