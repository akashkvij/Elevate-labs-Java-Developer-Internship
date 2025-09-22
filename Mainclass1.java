package com.elevatelabs.internship;

import java.util.Scanner;

public class Mainclass1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean con=true;
		System.out.println("-------------------------------------------------------------------------");
		
		while(con) {
			
			System.out.println("1:Addition");
			System.out.println("2:Subtraction");
			System.out.println("3:Multiplication");
			System.out.println("4:Division");
			System.out.println("5: exit");
			int choose=sc.nextInt();
			
			
			if(choose==5) {
				con=false;
				System.out.println("Exiting Calculator ");
				break;
				
			}
			System.out.println("Enter the FirstNumber");
			double num1=sc.nextDouble();
			System.out.println("Enter the SecondNumber");
			double num2=sc.nextDouble();
			System.out.println();
			
			switch(choose) {
			case 1:
				 
				System.out.println("Addition of "+num1+"+"+num2+"="+Calculator.add(num1,num2));
				System.out.println();
				break;
			case 2:
				System.out.println("subraction of "+num1+"-"+num2+"="+Calculator.subtract(num1,num2));
				System.out.println();
				break;
			case 3:
				System.out.println("Multiplication of "+num1+"*"+num2+"="+Calculator.multiply(num1,num2));
				System.out.println();
				break;
			case 4:
				System.out.println("Division of "+num1+"/"+num2+"="+Calculator.divide(num1,num2));
				System.out.println();
				break;
			
			default:
				System.out.println("invalid operation");
				System.out.println();
				
		}
			System.out.println("-------------------------------------------------------------------------");
			
		}
	}

}
