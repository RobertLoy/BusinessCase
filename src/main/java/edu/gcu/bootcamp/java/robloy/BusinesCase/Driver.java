package edu.gcu.bootcamp.java.robloy.BusinesCase;

import java.util.Scanner;

public class Driver {
	
	static int eId = 0;
	static int bId = 0;
	ECommerce [] ecustomers = new ECommerce[5];
	BrickAndMortar [] bcustomers = new BrickAndMortar[5];
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d = new Driver();
		d.menu();
	}
	
	public void menu() {

		try {
			System.out.println("CUSTOMER ADMIN MENU");
			System.out.println("====================");
			System.out.println("1 - Add a new Retail Customer");
			System.out.println("2 - Add a new Ecommerce Customer");		
			System.out.println("3 - View a Retail Customer");
			System.out.println("4 - View an Ecommerce Customer");
			System.out.println("5 - Update a Retail Customer");
			System.out.println("6 - Update an Ecommerce Customer");
			System.out.println("7 - Remove a Retail Customer");
			System.out.println("8 - Remove an Ecommerce Customer");
			System.out.println("9 - View ALL Customers");
			System.out.println("0 - Exit");			
			System.out.println("====================");
			System.out.println("Pick an option : ");
			actionMenu(sc.nextInt());
			menu();
		}
		catch (Exception e) {
			System.out.println("You must enter a NUMBER between 0 and 9");
			menu();
		}

	}
	
	public void actionMenu(int action) {
		
		switch(action) {
		case 0:
			System.out.println("EXIT");
			System.out.println("Thank you. Come again");
			System.exit(0);
			break;
		case 1:
			System.out.println("ADD A CUSTOMER");
			System.out.println("Enter Brick and Mortar customer information");
			String [] phones = {"555-555-5555","555-321-1234"};
			bcustomers[bId] = new BrickAndMortar(bId, "John", "Doe", "123 Easy St", "Madison",
					"WI", "53122", phones);
			bId++;
			break;
		case 2:			
			System.out.println("ADD A CUSTOMER");
			System.out.println("Enter Brick and Mortar customer information");
			String [] cc = {"5555-5555-5555-5555","1234-1234-1234-1234"};
			ecustomers[eId] = new ECommerce(eId, "John", "Doe", "rob@test.com", cc);
			eId++;
			break;
		case 3:
			System.out.println("VIEW A CUSTOMER");
			showCustomers('E');
			System.out.println("Pick an Ecommerce Customer to View");
			displayCustomer(sc.nextInt());
			break;
		case 4:
			System.out.println("VIEW A CUSTOMER");
			showCustomers('B');
			System.out.println("Pick a Brick and Mortar Customer to View");			
			displayCustomer(sc.nextInt());			
			break;
		case 5:
			System.out.println("UPDATE A CUSTOMER");
			showCustomers('B');
			System.out.println("Pick a Brick and Mortar Customer to Update");			
			updateCustomer(sc.nextInt(),'B');			
			break;
		case 6: 
			System.out.println("UPDATE A CUSTOMER");
			showCustomers('E');
			System.out.println("Pick a Ecommerce Customer to Update");			
			updateCustomer(sc.nextInt(),'E');			
			break;
		case 7: 
			System.out.println("REMOVE A CUSTOMER");
			showCustomers('B');
			System.out.println("Pick a Ecommercer Customer to Remove");			
			displayCustomer(sc.nextInt());			
			break;
		case 8:
			System.out.println("REMOVE A CUSTOMER");	
			showCustomers('E');
			System.out.println("Pick a Ecommerce Customer to Remove");			
			displayCustomer(sc.nextInt());			
			break;
		case 9:
			System.out.println("SEE ALL CUSTOMERS");	
			showCustomers('A');
			break;
		default:
			System.out.println("Invalid option");
			menu();
			
		}
	}
	
	public void showCustomers(char opt) {

		int cnt = 0;
		switch (opt){
		case 'A':

			for (BrickAndMortar b : bcustomers) {
				System.out.println(cnt + " - " + b);
				cnt++;
			}
			for (ECommerce e : ecustomers) {
				System.out.println(cnt + " - " + e);
				cnt++;
			}			   
			break;
		case 'B':
			for (BrickAndMortar b : bcustomers) {
				System.out.println(cnt + " - " + b);
				cnt++;
			}
			break;
		case'E':
			for (ECommerce e : ecustomers) {
				System.out.println(cnt + " - " + e);
				cnt++;
			}	
			break;
		default:
				
		}
		
	}
	
	public void displayCustomer(int cust) {
		if (cust > 5) {
			cust -= 5;
			System.out.println("DISPLAY ECOMMERCE CUSTOMER");
			System.out.println(ecustomers[cust]);
		}
		else {
			System.out.println("DISPLAY BRICK AND MORTAR CUSTOMER");
			System.out.println(bcustomers[cust]);			
		}
	}
	
	public void updateCustomer(int cust, char type) {
		if (type== 'E') {
			System.out.println("EDIT ECOMMERCE CUSTOMER");
			ecustomers[cust].setFirstName("Newly");
			System.out.println(ecustomers[cust]);
		}
		else {
			System.out.println("EDIT BRICK AND MORTAR CUSTOMER");
			bcustomers[cust].setFirstName("Oldly");
			System.out.println(bcustomers[cust]);			
		}
	}	

}
