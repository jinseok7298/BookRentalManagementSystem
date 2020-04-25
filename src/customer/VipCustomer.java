package customer;

import java.util.Scanner;

public class VipCustomer extends Customer {

	protected String limitedBook;
	protected String longPeriod;

	public VipCustomer(CustomerKind kind) { 
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Customer ID : ");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("Customer Name : ");
		String name = input.next();
		this.setName(name);

		System.out.print("Phone number : ");
		String phone = input.next();
		this.setPhone(phone);

		char answer = 'x'; 
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') { 
			System.out.print("Do you want to borrow a limited edition book ? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				String js = input.nextLine();
				System.out.print("Borrowed limited edition book name : ");
				String limitedBook = input.nextLine();
				this.setBook(limitedBook);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				String js = input.nextLine();
				System.out.print("Borrowed Book Name : ");
				String book = input.nextLine();
				this.setBook(book);
				break;
			}
			else {
			}
		}

		answer = 'x'; 
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') { 
			System.out.print("Do you want to borrow a book for a long time ? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				String js = input.nextLine();
				System.out.print("Loan Long Period : ");
				String longPeriod = input.nextLine();
				this.setPeriod(longPeriod);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				String js = input.nextLine();
				System.out.print("Loan Period : ");
				String period = input.nextLine();
				this.setPeriod(period);
				break;
			}
			else {
			}
		}


	}

	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Member:
			skind = "Member";
			break;
		case Nonmember:
			skind = "Nonmember";
			break;
		case Vip:
			skind = "Vip";
			break;
		case Family:
			skind = "Family";
			break;
		default :

		}
		System.out.println("kind : " + skind + " name : " + name + " id :" + id + " phone : " + phone + " book : " + book + " period : " + period + " limited book : " + limitedBook + " long period : " + longPeriod);
	}
}