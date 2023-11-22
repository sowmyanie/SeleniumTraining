package com.learn;

public class InherFromOtherClass extends Salary{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary S =new Salary();  
		System.out.println("this is a inheritance test from other class-Salary");
		//from Salary.java file
		S.bonus=500;
		System.out.println(S.bonus);
	}
}
