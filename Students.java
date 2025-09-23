package com.elevatelabs.internship;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {
	private static ArrayList<student> students=new ArrayList<>();
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		boolean con=true;
		int choice;
		while(con) {
			System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            if(choice==5) {
            	System.out.println("exiting ");
            	con=false;
            	break;
            }
            switch(choice) {
            case 1:addstudent();
            		break;
            case 2:viewstudent();
            		break;
            case 3:updatestudent();
            		break;
            case 4:deletestudent();
            		break;
            default:System.out.println("enter the valid option");
            		break;
            }
		}
		
		
		}
	private static void deletestudent() {
		 System.out.print("Enter Student ID to delete: ");
	        int id = sc.nextInt();
	        
	        boolean removed = students.removeIf(s -> s.getId() == id);

	        if (removed) {
	            System.out.println("Student deleted successfully!");
	        } else {
	            System.out.println("Student not found!");
	        }
	}
	private static void updatestudent() {
		System.out.println("enter the student id");
		int sid=sc.nextInt();
		sc.nextLine();
		boolean found=true;
		for(student s : students) {
			if(s.getId()==sid) {
				System.out.println("enter the student name");
				String sname=sc.nextLine();
				System.out.println("enter the marks");
				double smark=sc.nextDouble();
				
				s.setName(sname);
				s.setMarks(smark);
				
				System.out.println("student details updated");
				found=true;
				break;
			}
			
		}
		if(!found) {
			System.out.println("Student details not found ");
		}
			
	}
	private static void viewstudent() {
		if(students.isEmpty()) {
			System.out.println("student list is empty");
		}
		else {
			for(student s:students) {
				System.out.println(s);
			}
		}
	}
	private static void addstudent() {
		System.out.println("enter the student Id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the student name");
		String name=sc.nextLine();
		System.out.println("enter the marks");
		double mark=sc.nextDouble();
		student student=new student(id,name,mark);
		students.add(student);

	}
	
	

}
