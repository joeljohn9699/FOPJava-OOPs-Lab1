package com.gl.service;

import java.util.Random;

public class CredentialService {
	
	public String generateEmailAddress(String firstName, String lastName, String dept) {
		return firstName+lastName+"@"+dept+".abc.com";
	}
	
	public String generatePassword() {
		String capLett = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLett = "abcdefghijklmnopqrstuvwxyz";
		String numb = "0123456789";
		String splChars = "!@#$%^&*-";
		String finalPwd = capLett+smallLett+numb+splChars;
		char p [] = new char [8];
		
		Random rnd = new Random();
		for (int i = 0; i < 8; i++) {
			p[i] = finalPwd.charAt(rnd.nextInt(finalPwd.length())); 
		}
		return new String (p);
	}
	
	public void showCredentials(String firstName, String lastName, String emailAdd, String passwd) {
		System.out.println("Dear "+firstName +" your generated credentials are as follows:");
		System.out.println("Email ---> " +emailAdd);
		System.out.print("Password --->" +passwd);
	}

}
