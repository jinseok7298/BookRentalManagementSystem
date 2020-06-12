package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger Logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CustomerManager customerManager = getObject("customermanager.ser");
		if(customerManager == null) {
			customerManager = new CustomerManager(input);
		}
		else {
			customerManager.setScanner(input);
		}
		
		WindowFrame frame = new WindowFrame(customerManager);
		selectMenu(input, customerManager);
		putObject(customerManager, "customermanager.ser");
	}
	
	public static void selectMenu(Scanner input, CustomerManager customerManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					customerManager.addCustomer();
					Logger.log("add a customer");
					break;
				case 2:
					customerManager.deleteCustomer();
					Logger.log("delete a customer");
					break;
				case 3:
					customerManager.editCustomer();
					Logger.log("edit a customer");
					break;
				case 4:
					customerManager.viewCustomers();
					Logger.log("view a list of customer");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("~ Book Rental Management System ~");
		System.out.println(" 1. Add Customer");
		System.out.println(" 2. Delete Customer");
		System.out.println(" 3. Edit Customer");
		System.out.println(" 4. View Customers");
		System.out.println(" 5. Exit");
		System.out.println("Select one menu between 1 - 5 : ");
	}
	
	public static CustomerManager getObject(String filename) {
		CustomerManager customerManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			customerManager = (CustomerManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return customerManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customerManager;
	}
	
	public static void putObject(CustomerManager customerManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(customerManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
