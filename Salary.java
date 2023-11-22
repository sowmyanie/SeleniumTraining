package com.learn;

class Employee{  
	 float salary=40000;  
	 String Dept="HR";
	 
	}  
public class Salary extends Employee{

	int bonus=10000;  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary S =new Salary();  
		   System.out.println("Programmer salary is:"+S.salary);
		   System.out.println("Programmer salary is:"+S.Dept);
		   System.out.println("Bonus of Programmer is:"+S.bonus);  
	}
	

}
