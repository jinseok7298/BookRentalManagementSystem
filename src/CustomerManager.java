import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import customer.CustomerInput;
import customer.CustomerKind;
import customer.MemberCustomer;
import customer.NonMemberCustomer;
import customer.VipCustomer;


public class CustomerManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7230914715683316332L;
	
	ArrayList<CustomerInput> customers = new ArrayList<CustomerInput>();
	transient Scanner input;
	CustomerManager(Scanner input){
		this.input = input; 
	}
	
	public void setScanner(Scanner input) {
		this.input = input;
	}
	
	public void addCustomer() {
		int kind = 0;
		CustomerInput customerInput;
		while(kind != 1 && kind != 2 && kind != 3) {
			try {
				System.out.println(" 1 for Member");
				System.out.println(" 2 for Non-Member");
				System.out.println(" 3 for Vip");
				System.out.print("Select num 1, 2, or 3 for Customer kind : ");
				kind = input.nextInt();
				if (kind == 1) { 
					customerInput = new MemberCustomer(CustomerKind.Member);
					customerInput.getUserInput(input);
					customers.add(customerInput); 
					break;
				}
				else if(kind == 2) { 
					customerInput = new NonMemberCustomer(CustomerKind.Nonmember);
					customerInput.getUserInput(input);
					customers.add(customerInput);
					break;
				}
				else if(kind == 3) { 
					customerInput = new VipCustomer(CustomerKind.Vip);
					customerInput.getUserInput(input);
					customers.add(customerInput);
					break;
				}
				else {
					System.out.println("Select num for Customer kind between 1 and 3! ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	public void deleteCustomer() {
		System.out.print("Customer ID : ");
		int customerid = input.nextInt();
		int index = findIndex(customerid);
		removefromCustomers(index, customerid);
	}
	
	public int findIndex(int customerid) {
		int index = -1;
		for (int i = 0; i<customers.size(); i++) {
			if (customers.get(i).getId() == customerid) { 
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromCustomers(int index, int customerid) {
		if (index >= 0) { 
			customers.remove(index);
			System.out.println("the customer" + customerid + "is deleted");
			return 1;
		}
		else {
			System.out.println("the customer has not been registered");
			return -1;
		}
	}
	
	public void editCustomer() {
		System.out.print("Customer ID : ");
		int customerid = input.nextInt();
		for (int i = 0; i<customers.size(); i++) { 
			CustomerInput customer = customers.get(i);
			if (customer.getId() == customerid) {
				int num = -1;
				while(num != 6) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						customer.setCustomerID(input);
						break;
					case 2:
						customer.setCustomerName(input);
						break;
					case 3:
						customer.setCustomerPhone(input);
						break;
					case 4:
						customer.setCustomerBook(input);
						break;
					case 5:
						String js = input.nextLine();
						customer.setCustomerPeriod(input);
						break;
					default:
						continue;
					}
				}
			break;	
			}	
		}
	}
	public void viewCustomers() {
		System.out.println("# of registered customers : " + customers.size());
		for (int i = 0; i<customers.size(); i++) {
			customers.get(i).printInfo(); 
		}
	}
	
	public void showEditMenu() {
		System.out.println("~ Customer Info Edit Menu ~");
		System.out.println(" 1. Edit Id");
		System.out.println(" 2. Edit Name");
		System.out.println(" 3. Edit Phone");
		System.out.println(" 4. Edit Book");
		System.out.println(" 5. Edit Period");
		System.out.println(" 6. Exit");
		System.out.println("Select one menu between 1 - 6 : ");
	}

}
