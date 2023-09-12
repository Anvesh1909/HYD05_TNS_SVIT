package com.svit.opps;
import com.myprograms.Fibonacii;

class Student {
	int rollno;
	String name;
}

class MyStudents{
	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student();
		
		s1.rollno = 701;
		s1.name= "Anvesh";
		
		s2.rollno= 702;
		s2.name= "Bunny";
		
		System.out.println("rollno \tname");
		System.out.println(s1.rollno+"\t"+s1.name);
		System.out.println(s2.rollno+"\t"+s2.name);
		
		Fibonacii.Numbers(10);
		
	}
}
