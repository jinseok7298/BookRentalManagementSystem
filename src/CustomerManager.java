import java.util.Scanner;

public class CustomerManager {
	Customer customer;
	Scanner input;
	CustomerManager(Scanner input){
		this.input = input;
	}
	
	public void addCustomer() {
		customer = new Customer();
		System.out.print("Customer ID : ");
		customer.id = input.nextInt();
		
		System.out.print("Customer Name : ");
		customer.name = input.next();
		
		System.out.print("Phone number : ");
		customer.phone = input.next();
		
		System.out.print("Borrowed Book Name : ");
		customer.book = input.nextLine();
		String js = input.nextLine();
		//String js = input.nextLine();를 입력한 이유는 nextLine 이용시 엔터키를 문장으로 인식되는 오류 막으려고.
		System.out.print("Loan Period : ");
		customer.period = input.nextLine();
	}
	public void deleteCustomer() {
		System.out.print("Customer ID : ");
		int customerid = input.nextInt();
		if (customer == null) {
			System.out.println("the customer has not been registered");
			return;
		}
		if (customer.id == customerid) {
			customer = null;
			System.out.println("the customer is deleted");
		}
	}
	public void editCustomer() {
		System.out.print("Customer ID : ");
		int customerid = input.nextInt();
		if (customer.id == customerid) {
			System.out.println("the customer to be edited is " + customerid);
		}
	}
	public void viewCustomer() {
		System.out.print("Customer ID : ");
		int customerid = input.nextInt();
		if (customer.id == customerid) {
			customer.printInfo();
		}
	}

}
