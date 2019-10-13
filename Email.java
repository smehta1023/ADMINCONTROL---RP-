package EmailApp;

import java.util.Scanner;

public class Email {
	//nena
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	int mailBoxCapacity = 500;
	int defaultPasswordLength = 8;//change base on specs
	private String alternateEmail;
	private String companySuffix = "BellyRubs4me.com";

	
	//Constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.print("EMAIL CREATED: " + this.firstName + " " + this.lastName + ";");
		
		//call a method to asking for the department - returns the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.print("Temporary Password is " + this.password + "          ");
		
		//combine a method that returns a random password
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix; 
		System.out.print("EMPLOYEE'S EMAIL: " + email + "   ");
		
		//alternateEmail = System.out.print("Your alternate email is " + this.alternateEmail);
	}
	
	//ask for the department   
	private String setDepartment() {
		System.out.println(" DEPARTMENT CODES\n1 for Sales\n2 for Accounting\n3 Development\n4 Admin\n0 none\nEnter the department: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "Sales"; }
		else if(depChoice == 2) {return "Accounting"; }
		else if(depChoice == 3) {return "Development"; }
		else if(depChoice == 4) {return "Admin"; }
		else {return "none"; }
	}
	
	//Generate a random password 
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!#$";
		char [] password = new char [length];
		for(int i = 0; i<length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	//Set the alternate email 
	public void setAlternateEmail(String alternate) {
		this.alternateEmail = alternate;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() { return mailBoxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }
}