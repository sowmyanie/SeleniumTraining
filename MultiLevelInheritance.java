package com.learn;

class Animal{  
	int a=2;
void ani(){
	System.out.println("Multi level inheritance");
	System.out.println("I am from Animal class...");
		}  
}  
class Dog extends Animal{  
void dog(){ 
	System.out.println("I am from Animal ->Dog class...");}  
}  
class Pup extends Dog{  
void pup(){
	System.out.println("I am from Animal ->Dog class ->Pup class...");}  
}  

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pup d=new Pup();  
		d.ani();  
		d.dog();  
		d.pup();  
		System.out.println("Types of animals :" +d.a);
		
	}

}
