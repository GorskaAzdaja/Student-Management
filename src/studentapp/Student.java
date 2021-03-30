package studentapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String courses;
	private String studentID;
	private int year;
	private int balance = 0;
	private static int courseCost = 600;
	private static int id = 1000;
	
//	Constructor: enter student name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student's first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student's last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Sophomore");
		System.out.print("Enter student grade: ");
		this.year = in.nextInt();
		
		setStudentID();
	}
	
//	Generate 5 digit ID
	private void setStudentID() {
//		Student year + template ID
		id++;
		this.studentID = year + "" + id;
		
	}
	
//	Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("q")) {
				courses = courses + "\n " + course;
				balance = balance + courseCost;
			} else
				break;
		}  while(true);
	}
	
//	Tuition transactions
	public void viewBalance() {
		System.out.println("Your balance is: $" + balance);
	}
	
//	Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your tuition payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		balance = balance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
//	Show information
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nYear: " + year +
				"\nStudentID: " + studentID +
				"\nCourses enrolled: " + courses +
				"\nBalance: $" + balance;
	}

}
