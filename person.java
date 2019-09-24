package sefrealestate;

import java.util.ArrayList;
import java.util.Scanner;

public class person {

	private String ID;
	private String Name;
	private int Age;
	private String Address;
	private String phone;
	private String Email;
	private String Gender;
	private String password;
	
	private ArrayList<String> allsuburb = new ArrayList<>();
	

public person(String iD, String name, int age, String address, String phone, String email, String gender, String password) {
	
	this.ID = iD;
	this.Name = name;
	this.Age = age;
	this.Address = address;
	this.phone = phone;
	this.Email = email;
	this.Gender = gender;
	this.password = password;
		
}

public void addSuburb (String suburb) {
	   allsuburb.add(suburb);	  
}


	


public String getID() {
	return ID;
}



public String getName() {
	return Name;
}



public int getAge() {
	return Age;
}



public String getAddress() {
	return Address;
}



public String getPhone() {
	return phone;
}



public String getEmail() {
	return Email;
}



public String getGender() {
	return Gender;
}



public String getPassword() {
	return password;
}





public void setID(String iD) {
	ID = iD;
}





public void setName(String name) {
	Name = name;
}





public void setAge(int age) {
	Age = age;
}





public void setAddress(String address) {
	Address = address;
}





public void setPhone(String phone) {
	this.phone = phone;
}





public void setEmail(String email) {
	Email = email;
}





public void setGender(String gender) {
	Gender = gender;
}





public void setPassword(String password) {
	this.password = password;
}







}

