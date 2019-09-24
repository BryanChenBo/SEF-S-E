package sefrealestate;

import java.util.ArrayList;
import java.util.Scanner;

public class RealEstate {

	private ArrayList<person> allusers = new ArrayList<>();
	private ArrayList<Property> allpro = new ArrayList<>();
	private ArrayList<offer> alloffer = new ArrayList<>();

	public void addPerson(person person) {
		allusers.add(person);

	}

	// check login
	public person getPerson(String logid, String logpass) {
		person person = null;
		boolean perExist = false;
		for (int y = 0; y < allusers.size(); y++) {
			if (logid.equals(allusers.get(y).getID()) && logpass.equals(allusers.get(y).getPassword())) {
				person = allusers.get(y);
				perExist = true;
			}
		}
		if (perExist == false) {
			System.out.println("Invaild ID or password");
		}
		return person;
	}

	// show all properties
	public void showAllproperty() {
		for (int i = 0; i < allpro.size(); i++) {
			System.out.println(allpro.get(i).getPropertyID() + "::" + allpro.get(i).getName() + "::"
					+ allpro.get(i).getAdress() + "::" + allpro.get(i).getCapacity() + "::" + allpro.get(i).getSuburb()
					+ "::" + allpro.get(i).getType() + "::" + allpro.get(i).getPrice() + "\n");
		}

	}

	// add property for lease
	public boolean leasepro(String id) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("please enter the property ID");
		String propertyID = s.next();
		System.out.println("please enter the property name");
		String name = s.next();
		System.out.println("please enter the property address");
		String adress = s.next();
		System.out.println("please enter the property suburb");
		String suburb = s.next();
		System.out.println("please enter the property capacity");
		String capacity = s.next();
		System.out.println("please enter the property price");
		Double price = s.nextDouble();
		Property newpro = new Property(propertyID, name, adress, suburb, capacity, price, "lease", price * 0.05,
				"not rented", id);
		allpro.add(newpro);
		System.out.println("Lease information posted!");
		return true;
	}

	// add property for sell
	public boolean sellpro(String id) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("please enter the property ID");
		String propertyID = s.next();
		System.out.println("please enter the property name");
		String name = s.next();
		System.out.println("please enter the property address");
		String adress = s.next();
		System.out.println("please enter the property suburb");
		String suburb = s.next();
		System.out.println("please enter the property capacity");
		String capacity = s.next();
		System.out.println("please enter the property price");
		Double price = s.nextDouble();
		Property newpro = new Property(propertyID, name, adress, suburb, capacity, price, "sell", price * 0.05,
				"not sold", id);
		allpro.add(newpro);
		System.out.println("Sell information posted!");
		return true;
	}

	// search
	public Property search(String id) {
		Property pro = null;
		boolean proExist = false;
		for (int y = 0; y < allpro.size(); y++) {
			if (id.equals(allpro.get(y).getPropertyID())) {
				pro = allpro.get(y);
				proExist = true;
			}
		}
		if (proExist == false) {
			System.out.println("property not exist!");
		}

		System.out.println(pro.getPropertyID() + "::" + pro.getName() + "::" + pro.getAdress() + "::"
				+ pro.getCapacity() + "::" + pro.getSuburb() + "::" + pro.getType() + "::" + pro.getPrice() + "\n");
		return pro;
	}

	// edit profile
	public boolean editprofile(String id) {
		person person = null;
		boolean perExist = false;
		for (int y = 0; y < allusers.size(); y++) {
			if (id.equals(allusers.get(y).getID())) {
				person = allusers.get(y);
				perExist = true;
			}
		}
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("Please enter your ID:");
		String logID = s.next();
		person.setID(logID);
		System.out.println("Please enter your name:");
		String name = s.next();
		person.setName(name);
		System.out.println("Please enter your age:");
		int age = s.nextInt();
		person.setAge(age);
		System.out.println("Please enter your address:");
		String address = s.next();
		person.setAddress(address);
		System.out.println("Please enter your phone:");
		String phone = s.next();
		person.setPhone(phone);
		System.out.println("Please enter your email:");
		String email = s.next();
		person.setEmail(email);
		System.out.println("Please enter your gender:");
		String gender = s.next();
		person.setGender(gender);
		System.out.println("Please enter your password:");
		String password = s.next();
		person.setPassword(password);
		return true;
	}

	public int findproperty(String propertyid) {
		int i;
		for (i = 0; i < allpro.size(); i++) {
			if (allpro.get(i).getPropertyID().equals(propertyid)) {
				return i;
			}
		}
		return -1;
	}

	private boolean checkexit(String propertyid) {
		for (int i = 0; i < allpro.size(); i++) {
			if (allpro.get(i).getPropertyID().equals(propertyid)) {
				return false;

			}

		}
		return true;

	}

	// rent property
	public void rentproperty() {
		showAllproperty();
		System.out.println("which property do you want to rent , please enter the PropertyID");
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		if (checkexit(a) == false) {
			System.out.println("how long do you want to rent for");
			int j = findproperty(a);
			allpro.get(j).setStatus("inrent");

		} else {
			System.out.println("property does not exit");
		}
		;
	}

	// buy property
	public void buyproperty() {
		showAllproperty();
		System.out.println("which property do you want to buy , please enter the PropertyID");
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		if (checkexit(a) == false) {
			int j = findproperty(a);
			allpro.get(j).setStatus("sold");
		} else {
			System.out.println("property does not exit");
		}
	}

	// add suburb
	public void addsuburb(String id) {
		System.out.println("what is your interesting suburb,please enter the name of suburb");
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		person person = null;
		for (int y = 0; y < allusers.size(); y++) {
			if (id.equals(allusers.get(y).getID())) {
				person = allusers.get(y);
			}
		}

		person.addSuburb(a);
	}

	// make offer
	public void makeoffer() {
		System.out.println("which kind of offer do you want to make , 1 for rent , 2 for buy ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if (a == 1) {
			System.out.println("please enter an ID you like as your offer ID ");
			String offerID = scanner.next();
			System.out.println("please enter the property ID you want to rent ");
			String propertyID = scanner.next();
			System.out.println("please enter the property Name you  you want to rent ");
			String propertyName = scanner.next();
			System.out.println("please enter your name");
			String name = scanner.next();
			System.out.println("please enter your ID ");
			String iD = scanner.next();
			System.out.println("please enter the offer Date(today) ");
			String offerDate = scanner.next();
			System.out.println("please enter the duration that how long do you want to rent");
			String duration = scanner.next();
			System.out.println("please enter the weekly Rent fee that you want (which will be shown to landlord)");
			Double weeklyRent = scanner.nextDouble();
			offer y = new offer(offerID, propertyID, propertyName, name, iD, offerDate, duration, weeklyRent);
			alloffer.add(y);
		} else {
			System.out.println("please enter an ID you like as your offer ID ");
			String offerID = scanner.next();
			System.out.println("please enter the property ID you want to rent ");
			String propertyID = scanner.next();
			System.out.println("please enter the property Name you  you want to rent ");
			String propertyName = scanner.next();
			System.out.println("please enter your name");
			String name = scanner.next();
			System.out.println("please enter your ID ");
			String iD = scanner.next();
			System.out.println("please enter the offer Date(today) ");
			String offerDate = scanner.next();
			System.out.println("please enter the price that you want for this property");
			double price = scanner.nextDouble();
			offer z = new offer(offerID, propertyID, propertyName, name, iD, offerDate, price);
			alloffer.add(z);
		}

	}

	// accept offer
	public void acceptoffer(String id) {
		for (offer offer : alloffer) {
			for (Property property : allpro) {
				if (property.getOwnerID() == id) {
					if (property.getPropertyID() == offer.getPropertyID()) {
						offer.setStatus("accepted");
					}

				}
			}

		}
	}

	
}
