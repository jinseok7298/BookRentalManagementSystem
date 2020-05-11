package customer;

import java.util.Scanner;

public class VipCustomer extends Customer {

	protected String limitedBook;
	protected String longPeriod;
	
	public void setLimitedBook(String limitedBook) {
		this.limitedBook = limitedBook;
	}

	public void setLongPeriod(String longPeriod) {
		this.longPeriod = longPeriod;
	}

	public VipCustomer(CustomerKind kind) { 
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setCustomerID(input);
		setCustomerName(input);
		setCustomerPhone(input);
		setCustomerLimitBookwithYN(input);
		setCustomerLongPeriodwithYN(input);
	}

	public void setCustomerLimitBookwithYN(Scanner input) {
		char answer = 'x'; 
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') { 
			System.out.print("Do you want to borrow a limited edition book ? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				String js = input.nextLine();
				System.out.print("Borrowed limited edition book name : ");
				String limitedBook = input.nextLine();
				this.setLimitedBook(limitedBook);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				setCustomerBook(input);
				break;
			}
			else {
			}
		}
	}
	
	public void setCustomerLongPeriodwithYN(Scanner input) {
		char answer = 'x'; 
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') { 
			System.out.print("Do you want to borrow a book for a long time ? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				String js = input.nextLine();
				System.out.print("Loan Long Period : ");
				String longPeriod = input.nextLine();
				this.setLongPeriod(longPeriod);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				setCustomerPeriod(input);
				break;
			}
			else {
			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : " + skind + " name : " + name + " id :" + id + " phone : " + phone + " book : " + book + " period : " + period + " limited book : " + limitedBook + " long period : " + longPeriod);
	}

}