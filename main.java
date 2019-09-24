package sefrealestate;

import java.util.Scanner;

public class main {
	static RealEstate se = new RealEstate();

	public static void main(String[] args) {

		start();

	}

	public static void start() {

		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("Welcome to S&E Real Estate");
		System.out.println("Enter 1 to logon, enter 2 to register");
		int logopt = s.nextInt();
		if (logopt == 1) {
			System.out.println("Please enter your ID:");
			String logID = s.next();
			System.out.println("Please enter your password:");
			String logpassword = s.next();
			if (se.getPerson(logID, logpassword) != null) {
				showMenu(logID);
			}

		} else if (logopt == 2) {
			System.out.println("Please enter your ID:");
			String logID = s.next();
			System.out.println("Please enter your name:");
			String name = s.next();
			System.out.println("Please enter your age:");
			int age = s.nextInt();
			System.out.println("Please enter your address:");
			String address = s.next();
			System.out.println("Please enter your phone:");
			String phone = s.next();
			System.out.println("Please enter your email:");
			String email = s.next();
			System.out.println("Please enter your gender:");
			String gender = s.next();
			System.out.println("Please enter your password:");
			String password = s.next();
			person p = new person(logID, name, age, address, phone, email, gender, password);
			se.addPerson(p);
			System.out.println("Resgister success!  " + logID);
			start();
		}

	}

	private static void showMenu(String id) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("**** please choose your identity, 1 for custormer, 2 for employee  ****");
		int i = scanner.nextInt();
		if (i == 1) {
			System.out.println("**** realestate custormer menu ****");
			System.out.println();
			System.out.println("show all property:               1");
			System.out.println("rent property:                   2");
			System.out.println("lease property:                  3");
			System.out.println("buy property:                    4");
			System.out.println("sell property                    5");
			System.out.println("search                           6");
			System.out.println("edit profile                     7");
			System.out.println("add suburb                       8");
			System.out.println("make offer                       9");
			System.out.println("check offers                     10");
			System.out.println("logout                           11");

			int g = scanner.nextInt();
			switch (g) {
			case 1:
				se.showAllproperty();
				break;
			case 2:
				se.rentproperty();
				break;
			case 3:
				se.leasepro(id);
				break;
			case 4:
				se.buyproperty();
				break;
			case 5:
				se.sellpro(id);
				break;
			case 6:
				System.out.println("enter the id for search");
				String d = scanner.next();
				se.search(id);
				break;
			case 7:
				se.editprofile(id);
				break;
			case 8:
				se.addsuburb(id);
				break;
			case 9:
				se.makeoffer();
				break;
			case 10:
				se.acceptoffer(id);
				break;
			case 11:
				System.exit(0);
				break;
			default:
				System.out.println("please enter a number from 1 to 11");

			}

		} else {
			System.out.println(
					"**** please choose your position, 1 for Property Manager, 2 for Branch Admin, 3 for Sales Consultants  ****");
			int j = scanner.nextInt();
			;
			if (j == 1) {
				System.out.println("**** Property Manager menu ****");
				System.out.println();
				System.out.println("Review Application:               1");
				System.out.println("Check Maintenence Report:              2");
				System.out.println("Advertise:            3");
				System.out.println("Organise Maintenence:       4");
				System.out.println("PayBills:       5");
				System.out.println("Inspection:       6");
				System.out.println("Deduct Fee FmPptyAccnt:       7");
			} else if (j == 2) {
				System.out.println("**** Branch Admin menu ****");
				System.out.println();
				System.out.println("Receive Document:               1");
				System.out.println("Scan Document:              2");
				System.out.println("Collect Rent:            3");
				System.out.println("CreditBranchAccount:       4");
				System.out.println("Run Payroll:       5");
			} else {
				System.out.println("**** Sales Consultants menu ****");
				System.out.println();
				System.out.println("Sell Property:               1");
				System.out.println("Advertise:              2");
				System.out.println("Liaise Vendor:            3");
				System.out.println("Inspection:       4");
				System.out.println("Negotiate Buyer:       5");
			}

		}

	}
}
