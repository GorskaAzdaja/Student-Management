package studentapp;

import java.util.Scanner;

public class StudentManagementApp {

	public static void main(String[] args) {
//		Multiple class object practice - custom number of students
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int studentNumber = in.nextInt();
		Student[] studentEntity = new Student[studentNumber];
		
//		Create n number of students
		for (int i = 0; i < studentNumber; i++) {
			studentEntity[i] = new Student();
			studentEntity[i].enroll();
			studentEntity[i].payTuition();
		}
		
		for (int i = 0; i < studentNumber; i++) {
			System.out.println(studentEntity[i].toString());
		}
	}

}
