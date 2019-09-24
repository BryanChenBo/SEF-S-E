package sefrealestate;

public class Employee extends person {
	private double HourRate;
	private int WorkingHour;
	private String Type;// (PartTime or FullTime)
	public Employee(String iD, String name, int age, String address, String phone, String email, String gender, String password,
			Character accesslevel, double hourRate, int workingHour, String type) {
		super(iD, name, age, address, phone, email, gender, password);
		HourRate = hourRate;
		WorkingHour = workingHour;
		Type = type;
	}
	
	
	
}
