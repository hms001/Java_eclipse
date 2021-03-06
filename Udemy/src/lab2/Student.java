/*
 * Student database
 */

package lab2;

import java.util.*;

public class Student{
	
	private static int id = 12;
	private String name;
	private String city;
	private String state;
	private String phone;
	private String SSN;
	private String userID;
	private static String course = "";	
	private static final double fees = 800.0;
	private double balance = 0.0;
	
	Random generator = new Random();
	
	public Student(String name, String SSN) {
		id++;
		this.name = name;
		this.SSN = SSN;		
		setUserID();
		
	}	
	
	private void setUserID() {
		int max = 9000;
		int min = 1000;
		//random 4-digit number between 1000 and 9000
		int random = (int)(Math.random()*(max-min));
		random = random + min;		
		userID = id + "" +random + SSN.substring(3);
		System.out.println("User ID :- " + userID);
	}
		
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	private String email() {
		return "E-mail - " + name.toLowerCase() + "@email.com";
	}
	
	public void enroll(String course) {
		this.course = this.course + "\n" + course;			
		balance = balance + fees;		
	}

	public void pay(double amount) {
		System.out.println("Paid :- $" + amount );		
		balance = balance - amount;		
		
	}

	public void checkBalance() {
		
		System.out.println("Balance left :- $" + balance);
	}

	
	public void showCourses() {
		
		System.out.println("Enrolled for " + course);
		System.out.println("Total Fees :- " + balance);
	}
	
	@Override
	public String toString() {
		return "1.Name - " + name + "\n2.Phone - "+ getPhone()+ "\n3.City - " + getCity() 
				+ "\n4.State - " + getState() + "\n5." + email();
	}
	

}
