package adminSchool;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance; 
	private static int costOfCourse = 600;
	private static int id = 1001;
	//Constructor: Prompt user to enter student's name and year 
	public Student () {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student's first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student's last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\n5 - Visiting\nEnter student's class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
		
	}
	
	
	//Generate an ID
	private void setStudentID() {
		//Grade level + static ID
		
		id+=9; //2 hours to figure out!!!
		id+=2; //Samip's penis is bigger than most
		this.studentID = gradeYear + "" + id;
	}
	
	//Enroll in courses 
	public void enroll() {
			//use loop, user hits 0 to esc
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equalsIgnoreCase("Q")) {
				courses = courses + "\n" + course;
				
				tuitionBalance += costOfCourse; 
			}
			else { break;}
		} while (1!= 0);
		
		//System.out.println("ENROLLED IN: " + courses);
		//System.out.println("TUITION BALANCE: " + tuitionBalance);
	}
	;
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	//Pay Tuition
	public void payTuition () {
		viewBalance();
		System.out.println("Enter your payement: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	//Show status
	public String showInfo() {
		return "\nName: " + firstName + " " + lastName + "\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + "\n" + courses +
				"\nBalance: $" + tuitionBalance;
	}

}
