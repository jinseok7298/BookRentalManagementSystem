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

		String js = input.nextLine();
		System.out.print("Borrowed Book Name : ");
		customer.book = input.nextLine();
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
			int num = -1;
			while(num != 6) {
				System.out.println("~ Customer Info Edit Menu ~");
				System.out.println(" 1. Edit Id");
				System.out.println(" 2. Edit Name");
				System.out.println(" 3. Edit Phone");
				System.out.println(" 4. Edit Book");
				System.out.println(" 5. Edit Period");
				System.out.println(" 6. Exit");
				System.out.println("Select one menu between 1 - 6 : ");
				num = input.nextInt();
				if(num == 1) {
					System.out.print("Customer ID : ");
					customer.id = input.nextInt();
				}
				else if(num == 2) {
					System.out.print("Customer Name : ");
					customer.name = input.next();
				}
				else if(num == 3) {
					System.out.print("Phone number : ");
					customer.phone = input.next();
				}
				else if(num == 4) {
					String js = input.nextLine();
					System.out.print("Borrowed Book Name : ");
					customer.book = input.nextLine();
				}
				else if(num == 5) {
					String js = input.nextLine();
					System.out.print("Loan Period : ");
					customer.period = input.nextLine();
				}
				else {
					continue;
				}
			}
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
