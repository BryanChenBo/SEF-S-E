package sefrealestate;

import java.util.ArrayList;

public class SalesConsultants extends Employee {
	public Double SaleBonus;
	private ArrayList<Customer> Customers = new ArrayList<>();
	
	public SalesConsultants(String iD, String name, int age, String address, String phone, String email, String gender,
			String password, Character accesslevel, double hourRate, int workingHour, String type) {
		super(iD, name, age, address, phone, email, gender, password, accesslevel, hourRate, workingHour, type);
		// TODO Auto-generated constructor stub
	}
	
      public void  SellProperty () {
    	  
      }
      public void  Advertise () {
    	  
      }
      public void  LiaiseVendor () {
	  
 }
      public void  OrganiseLegalValidation () {
	  
 }
      public void  Inspection () {
	  
 }
      public void  NegotiateBuyer () {
	  
 }
 

	
}
