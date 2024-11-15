package com.tnsif.ifet.daythree.scanner;
import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		String name;
		System.out.println("Enter person name : ");
		name=obj.next();
		System.out.println("Enter age : ");
		int age=obj.nextInt();
		System.out.println("Enter gender : ");
		String gender=obj.next();
		System.out.println("Enter taxable gender : ");
		int income=obj.nextInt();
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		System.out.println(person);
		TaxCalculation calc =new TaxCalculation();
		calc.calculateTax(person);
		System.out.println("After calculating tax : ");
		System.out.println(person);
		obj.close();
		
	}

}
