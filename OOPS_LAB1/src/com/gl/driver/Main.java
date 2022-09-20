package com.gl.driver;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.CredentialService;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your First name:");
		String fName = in.nextLine();
		System.out.println("Enter your Last name:");
		String lName = in.nextLine();
		Employee emp = new Employee(fName, lName);
		
		CredentialService serv = new CredentialService();
		
		String EmailAdd = null;
		String Passwd = null;
		
		System.out.println("Choose your Department:");
		System.out.println("1. Technical" +"\n2. Admin" +"\n3. Human Resource" +"\n4. Legal");
		int choice = in.nextInt();
				
		switch (choice) {
		case 1: EmailAdd = serv.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "tech");
				Passwd = serv.generatePassword(); 
				break;
		case 2: EmailAdd = serv.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "admin");
				Passwd = serv.generatePassword(); 
				break;
		case 3: EmailAdd = serv.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "hr");
				Passwd = serv.generatePassword(); 
				break;
		case 4: EmailAdd = serv.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "legal");
				Passwd = serv.generatePassword(); 
				break;
				
		default: System.out.println("Invalid choice."); 
				 break;
		}
			
		serv.showCredentials(emp.getFirstName(), emp.getLastName(), EmailAdd, Passwd);
		in.close();
							
	}

}
